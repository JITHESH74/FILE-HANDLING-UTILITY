package recommandationsystem;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.File;
import java.util.List;

public class RecommenderSystem {
    public static void main(String[] args){
        try{
            //step 1. load the data set
            DataModel model = new FileDataModel(new File("ratings.csv"));// destination path

            //step 2. compute users similarity
            UserSimilarity similarity = new EuclideanDistanceSimilarity(model);

            //step 3. define neighborhood(who is similar to whom)
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(3,similarity,model);

            //step 4. create recommender
            Recommender recommender = new GenericUserBasedRecommender(model,neighborhood,similarity);

            //step 5. get recommendations for user 1
            int userId =1;
            List<RecommendedItem> recommendation = recommender.recommend(userId,3);

            if(recommendation.isEmpty()){
                System.out.println("No recommendations found");
            }

            for(RecommendedItem recommendationItem : recommendation){
                System.out.println("Recommended itemId " + recommendationItem.getItemID() +
                        "value " +recommendationItem.getValue());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
