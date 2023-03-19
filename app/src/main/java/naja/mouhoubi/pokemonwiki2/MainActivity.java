package naja.mouhoubi.pokemonwiki2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1=(CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card2);
        card3=(CardView) findViewById(R.id.card3);
        card4=(CardView) findViewById(R.id.card4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.card1:
                i=new Intent(this,bulbasaurActivity2.class);
                startActivity(i);
                break;
            case R.id.card2:
                i=new Intent(this,Two.class);
                startActivity(i);
                break;
            case R.id.card3:
                i=new Intent(this,Three.class);
                startActivity(i);
                break;
            case R.id.card4:
                i=new Intent(this,Four.class);
                startActivity(i);
                break;


        }


    }
}