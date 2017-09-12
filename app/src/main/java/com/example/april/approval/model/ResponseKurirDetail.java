package com.example.april.approval.model;

import com.google.gson.annotations.SerializedName;


/**
 * Created by hp on 9/7/2017.
 */

public class ResponseKurirDetail {

    @SerializedName("nama")
    private String nama;

    @SerializedName("email")
    private String email;

    @SerializedName("error")
    private boolean error;

    @SerializedName("message")
    private String message;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isError() {
        return error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return
                "ResponseKurirDetail{" +
                        "nama = '" + nama + '\'' +
                        ",no_hp = '" + email + '\'' +
                        ",error = '" + error + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }

}
