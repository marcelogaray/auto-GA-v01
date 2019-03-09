package org.umssdiplo.automationv01.managefiles;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @autor Marcelo Garay
 */
public class HandleJsonFile {
    private static final String PATH_JSON = "jsonData".concat(File.separator);
    private static final String DATA_ENTRY_CAR = "dataEntryCar.json";
    private JsonParser parser;
    private InputStream inputStream;
    private JsonObject rootObject;
    private static HandleJsonFile handleJsonFile;

    private HandleJsonFile() {
        parser = new JsonParser();
        inputStream = getClass().getClassLoader().getResourceAsStream(PATH_JSON.concat(DATA_ENTRY_CAR));
    }

    public static HandleJsonFile getInstance() {
        if (handleJsonFile == null) {
            handleJsonFile = new HandleJsonFile();
        }
        return handleJsonFile;
    }

    /**
     * Read json file and convert to JsonObject
     *
     * @return JsonObject
     */
    public JsonObject getJsonObject() {
        Reader reader = new InputStreamReader(inputStream);
        rootObject = parser.parse(reader).getAsJsonObject();
        return rootObject;
    }

    /**
     * Read json file and convert to JsonArray
     *
     * @return JsonObject
     */
    public JsonArray getJsonArray() {
        Reader reader = new InputStreamReader(inputStream);
        return parser.parse(reader).getAsJsonArray();
    }

    public List<String> getAllElementsByNammeSubsection(String nameSubsection){
        JsonArray jsonArr = getJsonObject().get(nameSubsection).getAsJsonArray();
        return new Gson().fromJson(jsonArr, ArrayList.class);
    }
}