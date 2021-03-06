package com.example.a1144102654.firebaseui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=FirebaseDatabase.getInstance();
        DatabaseReference reference= db.getReference().child("usuarios").child("dsrasf");
       // Usuario nathan = new Usuario("sdsd","Nathan","nathan@g.com","2324");
       //reference.push().setValue(nathan);

    reference.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            for(DataSnapshot data: dataSnapshot.getChildren()){
             //   Usuario s=data.getValue(Usuario.class);
               // Log.e("NOMBRE","nombre:"+s.nombre);

                   Usuario s=dataSnapshot.getValue(Usuario.class);
                 Log.e("NOMBRE","nombre:"+s.nombre);


            }
        }


        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    }
}
