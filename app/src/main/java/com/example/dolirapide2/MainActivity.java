package com.example.dolirapide2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List pages;
    private String dernierElement;
    private int taille;

    private String ip;
    private String token;
    private String idNote;
    private String idU;

    public MainActivity() {
        pages = new ArrayList();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Login(this);
        //new Entre(this);
        pages.add("0");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        taille = pages.size() - 1;
        dernierElement = (String) pages.get(taille);
        if (dernierElement.equals("0")) {
            new Entre(this);
        }
        else if (dernierElement.equals("1")) {
            new Entre(this);
        }
        else if (dernierElement.equals("2")){
            new consultation(this);
        }
        pages.remove(taille);
        return true;
    }

    public List getPages() {
        return pages;
    }

    public void setPages(List pages) {
        this.pages = pages;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIdNote() {
        return idNote;
    }

    public void setIdNote(String idNote) {
        this.idNote = idNote;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }
}