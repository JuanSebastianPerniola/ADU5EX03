package com.example;

import com.mongodb.MongoClientException;
import com.mongodb.MongoCursorNotFoundException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoDatabaseImpl;

import javax.annotation.processing.SupportedOptions;

import org.json.JSONObject;
import org.json.XML;

public class App {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017/practiva_java"; // url a la database
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            try {
                // Seleccionar la base de datos y la colección
                MongoDatabase database = mongoClient.getDatabase("prct_java");
                MongoCollection<org.bson.Document> collection = database.getCollection("JsonToXML");
                MongoCursor<org.bson.Document> cursor = collection.find().iterator();
                while (cursor.hasNext()) {
                    // Iterar sobre los valores
                    System.out.println(XML.toString(new JSONObject(cursor.next().toJson())));
                }
            } catch (MongoCursorNotFoundException exception) {
                System.out.println(exception);
            }
        } catch (MongoClientException e) {
            System.out.println(e);
        }
    }
}
