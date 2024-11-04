package org.logant.Select;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.logant.Utils.MongoDBConnection;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SelectLessons {

    public static void FindByName(String name) {
        MongoDatabase database = null;
        MongoCursor<Document> cursor = null;
        try {
            database = MongoDBConnection.getConnection();
            MongoCollection<Document> collection = database.getCollection("firstCollection");
            
            Bson query = Filters.eq("name",name);
            Bson query2 = Filters.ne("aung chay",name);
            // Execute the query
            cursor = collection.find(query).iterator();

            // Iterate through the results and print each document
            if (!cursor.hasNext()) {
                System.out.println("No documents found matching the query.");
            } else {
                while (cursor.hasNext()) {
                    Document doc = cursor.next();
                    System.out.println("\n\n");
                    System.out.println(doc.toJson());
                }
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            // Close the MongoDB client
            MongoDBConnection.closeConnection();
        }
    }
}
