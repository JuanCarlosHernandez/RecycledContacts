package com.selectos.temas.recycledcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    RecyclerView rcContactstList;

    @Override
    protected void onCreate(Bundle savedInstanceState) //onCreate vincula con la vista del layout
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcContactstList = findViewById(R.id.rcContacsList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL); //Desplazamiento de arriba a abajo (gesto)
        rcContactstList.setLayoutManager(llm);
        InitializeContactsList();
        InitializeAdapter();
    }

    public void InitializeAdapter()
    {
        AdapterContact adapter = new AdapterContact(contacts);
        rcContactstList.setAdapter(adapter);
    }

    public void InitializeContactsList() //Method to initialize the list
    {
        contacts = new ArrayList<>();
        contacts.add(new Contact("Elliot Alderson","5566944852", "jh.mcw@gmail.com", R.drawable.eliot));
        contacts.add(new Contact("Mr. Robot","5566321479", "juan.ingenieria.23@gmail.com", R.drawable.christian));
        contacts.add(new Contact("Irving","5548791632", "juancho@yahoo.com", R.drawable.fsociety));

    }
}
