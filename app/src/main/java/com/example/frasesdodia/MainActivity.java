package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView campFrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Tente mover o mundo – o primeiro passo será mover a si mesmo.",
                "Quando vires um homem bom, tenta imitá-lo; quando vires um homem mau, examina-te a ti mesmo.",
                "Para ver muita coisa é preciso despregar os olhos de si mesmo",
                "Não ser descoberto numa mentira é o mesmo que dizer a verdade.",
                "A religião do futuro será cósmica e transcenderá um Deus pessoal, evitando os dogmas e a teologia.",
                "Não corrigir nossas falhas é o mesmo que cometer novos erros.",
                "Mesmo desacreditado e ignorado por todos, não posso desistir, pois para mim, vencer é nunca desistir.",
                "A alegria que se tem em pensar e aprender faz-nos pensar e aprender ainda mais.",
                "Se você continua vivo é porque ainda não chegou aonde devia.",
                "Duas coisas são infinitas: o universo e a estupidez humana. Mas, em relação ao universo, ainda não tenho certeza absoluta.",
                "O ignorante afirma, o sábio duvida, o sensato reflete."
        };

        campFrase = findViewById(R.id.textFrase);

        int numFrase = gerarNum();
        campFrase.setText(frases[numFrase]);


    }

    public int gerarNum(){
        Random random = new Random();
        int num = random.nextInt(11);
        return num;
    }

}
