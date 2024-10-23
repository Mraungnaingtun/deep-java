package org.logant.Select;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.logant.Utils.MongoDBConnection;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SimpleSelect {

    public static void simpleSelect() {
        MongoDatabase database = null;
        MongoCursor<Document> cursor = null;
        try {
            database = MongoDBConnection.getConnection();
            MongoCollection<Document> collection = database.getCollection("firstCollection");

            // Create the query to find documents with name "aung chay"
            Bson query = Filters.and(
                    Filters.eq("name", "aung chay"),
                    Filters.gte("age", 24),
                    Filters.eq("language", "java"));

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
