package founder.nugroho.aac_training.Api

import founder.nugroho.aac_training.Data.SearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Catalog {
    @GET("catalog/v4/search")
    fun search(@Query("q") q: String,
               @Query("limit") limit: Int = 10,
               @Query("offset") offset: Int = 0)

    :Call<SearchResponse>
}