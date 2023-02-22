package mm.marsman.pepcornassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/getAllUsers")
    Call<List<UserModel>> getUsers();
}
