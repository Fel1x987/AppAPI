package Interfaces
import Entidades.Articulo
import retrofit2.Call
import retrofit2.http.*

interface RestClient {
    @GET("articulos")
    fun cargarArticulos(): Call<List<Articulo>> //Call es como un return

    @POST("articulos")
    fun insertarArticulo(@Body articulo: Articulo): Call<Articulo>

    @PUT("articulos/{id}")
    fun modificarArticulo(@Body articulo: Articulo, @Path("id") id:String): Call<Articulo>

    @DELETE("articulos/{id}")
    fun eliminarArticulo(@Path("id") id:String): Call<String>

}
