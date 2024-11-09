package org.logant.NoSql;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static final String CONNECTION_STRING = "mongodb://localhost:27017"; // Replace with your connection string
    private static final String DATABASE_NAME = "firstdb"; // Replace with your database name

    private static MongoClient mongoClient; // Static MongoClient instance

    // Method to get the MongoDB connection
    public static MongoDatabase getConnection() {
        if (mongoClient == null) {
            MongoClientURI uri = new MongoClientURI(CONNECTION_STRING);
            mongoClient = new MongoClient(uri);
        }
        return mongoClient.getDatabase(DATABASE_NAME);
    }

    // Method to close the MongoClient
    public static void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null; // Set to null after closing
        }
    }
}
