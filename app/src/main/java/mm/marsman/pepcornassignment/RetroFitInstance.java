package mm.marsman.pepcornassignment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {

    public static RetroFitInstance instance;
    ApiInterface apiInterface;

    String api = "https://devapi.pepcorns.com/api/test/";

    RetroFitInstance(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface =  retrofit.create(ApiInterface.class);
    }

    public static RetroFitInstance getInstance(){
        if(instance == null){
            instance = new RetroFitInstance();
        }
        return instance;
    }

}
