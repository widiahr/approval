package com.example.april.approval.util.api;

import com.example.april.approval.model.ResponseKurir;
import com.example.april.approval.model.ResponsePaket;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by hp on 9/6/2017.
 */

public interface BaseApiService {
    // Fungsi ini untuk memanggil API http://10.0.2.2/latapi/index.php/login
    @FormUrlEncoded
    @POST("login")
    Call<ResponseBody> loginRequest(@Field("email") String email,
                                    @Field("pass") String pass);

    // Fungsi ini untuk memanggil API http://localhost/latapi/index.php/register
    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> registerRequest(@Field("email") String email,
                                       @Field("pass") String pass,
                                       @Field("nama") String nama,
                                       @Field("telp") String telp);

    @GET("semuakurir")
    Call<ResponseKurir> getSemuakurir();

    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> submitKurirRequest(@Field("email") String email,
                                          @Field("pass") String pass,
                                          @Field("nama") String nama,
                                          @Field("alamat") String alamat);

    @FormUrlEncoded
    @POST("input-paket")
    Call<ResponseBody> submitPaketRequest(@Field("kode_pengiriman") String kodepengiriman,
                                          @Field("pengirim") String pengirim,
                                          @Field("telp_pengirim") String telppengirim,
                                          @Field("penerima") String penerima,
                                          @Field("alamat_penerima") String alamatpenerima,
                                          @Field("telp_penerima") String telppenerima,
                                          @Field("jenis_barang") String jenisbarang,
                                          @Field("qty") String qty,
                                          @Field("width") String width,
                                          @Field("length") String length,
                                          @Field("height") String height,
                                          @Field("kendaraan") String kendaraan,
                                          @Field("ket") String ket,
                                          @Field("date") String date,
                                          @Field("kurir") String kurir);

    @GET("semuapaket")
    Call<ResponsePaket> getSemuapaket();
}
