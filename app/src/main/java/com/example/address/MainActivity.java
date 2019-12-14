package com.example.address;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    // these are the global variables
    Spinner classSpinner, divSpinner;
    // string variable to store selected values
    String selectedClass, selectedDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classSpinner = (Spinner) findViewById(R.id.classSpinner);
        divSpinner = (Spinner) findViewById(R.id.divSpinner);

        // Class Spinner implementing onItemSelectedListener
        classSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedClass = parent.getItemAtPosition(position).toString();
                switch (selectedClass) {
                    case "Jammu and Kashmir":
                        // assigning div item list defined in XML to the div Spinner

                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_1)));
                        break;

                    case "Jharkhand":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_2)));
                        break;

                    case "Karnataka":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_3)));
                        break;

                    case "Kerala":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_4)));
                        break;
                    case "Madya Pradesh":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_5)));
                        break;
                    case "Maharashtra":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_6)));
                        break;
                    case "Manipur":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_7)));
                        break;
                    case "Meghalaya":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_8)));
                        break;
                    case "Mizoram":
                        divSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_class_9)));
                        break;
                }

                //set divSpinner Visibility to Visible
                divSpinner.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // can leave this empty
            }
        });
        divSpinner.setOnItemSelectedListener(this);

        // divSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        divSpinner.setAdapter(dataAdapter);


        // Div Spinner implementing onItemSelectedListener

        divSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {
                selectedDiv = parent.getItemAtPosition(position).toString();

                Button button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        switch (selectedDiv) {

                            case "Doda" :

                                Intent intent = new Intent(MainActivity.this, Doda.class);
                                startActivity(intent);
                                break;

                            case "Jammu" :
                                Intent intent1 = new Intent(MainActivity.this, Jammu.class);
                                startActivity(intent1);
                                break;

                            case "Kathua" :
                                Intent intent2 = new Intent(MainActivity.this, Kathua.class);
                                startActivity(intent2);
                                break;

                            case "Kishtwar":
                                Intent intent3 = new Intent(MainActivity.this, Kishtwar.class);
                                startActivity(intent3);
                                break;
                            case "Poonch" :

                                Intent intent4 = new Intent(MainActivity.this, Poonch.class);
                                startActivity(intent4);
                                break;
                            case "Rajouri" :

                                Intent intent5 = new Intent(MainActivity.this, Rajouri.class);
                                startActivity(intent5);
                                break;
                            case "Ramban" :

                                Intent intent6 = new Intent(MainActivity.this, Ramban.class);
                                startActivity(intent6);
                                break;
                            case "Reasi" :

                                Intent intent7 = new Intent(MainActivity.this, Reasi.class);
                                startActivity(intent7);
                                break;
                            case "Samba" :

                                Intent intent8 = new Intent(MainActivity.this, Samba.class);
                                startActivity(intent8);
                                break;
                            case "Udhampur" :

                                Intent intent9 = new Intent(MainActivity.this, Udhampur.class);
                                startActivity(intent9);
                                break;
                            case "Anantnag" :

                                Intent intent10 = new Intent(MainActivity.this, Anantnag.class);
                                startActivity(intent10);
                                break;
                            case "Bandipora" :

                                Intent intent11 = new Intent(MainActivity.this, Bandipora.class);
                                startActivity(intent11);
                                break;
                            case "Baramulla" :

                                Intent intent12 = new Intent(MainActivity.this, Baramulla.class);
                                startActivity(intent12);
                                break;
                            case "Budgam" :

                                Intent intent13 = new Intent(MainActivity.this, Budgam.class);
                                startActivity(intent13);
                                break;
                            case "Ganderbal" :

                                Intent intent14 = new Intent(MainActivity.this, Ganderbal.class);
                                startActivity(intent14);
                                break;
                            case "Kulgam" :

                                Intent intent15 = new Intent(MainActivity.this, Kulgam.class);
                                startActivity(intent15);
                                break;
                            case "Kupwara" :

                                Intent intent16 = new Intent(MainActivity.this, Kupwara.class);
                                startActivity(intent16);
                                break;
                            case "Pulwama" :

                                Intent intent17 = new Intent(MainActivity.this, Pulwama.class);
                                startActivity(intent17);
                                break;
                            case "Shopian" :

                                Intent intent18 = new Intent(MainActivity.this, Shopian.class);
                                startActivity(intent18);
                                break;
                            case "Srinagar" :

                                Intent intent19 = new Intent(MainActivity.this, Srinagar.class);
                                startActivity(intent19);
                                break;
                            case "Kargil" :

                                Intent intent20 = new Intent(MainActivity.this, Kargil.class);
                                startActivity(intent20);
                                break;
                            case "Leh" :

                                Intent intent21 = new Intent(MainActivity.this, Leh.class);
                                startActivity(intent21);
                                break;
                        }
                    }

                });

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


