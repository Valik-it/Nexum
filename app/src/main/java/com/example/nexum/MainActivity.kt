package com.example.nexum


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var first_field: EditText? = null
    private var second_field: EditText? = null
    private var button: Button? = null
    private var btn_clear: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Находим элементы
        first_field = findViewById(R.id.first_field)
        second_field = findViewById(R.id.second_field)
        button = findViewById(R.id.button)
        btn_clear = findViewById(R.id.btn_clear)

        //Обработчик кнопок
        //button.setOnClickListener(this);
        //btn_clear.setOnClickListener(this);

        // читаем EditText и заполняем переменные числами
        //num1 = Float.parseFloat(first_field.getText().toString());
        //num2 = Float.parseFloat(second_field.getText().toString());

        // читаем EditText и заполняем переменные числами
        //num1 = Float.parseFloat(first_field.getText().toString());
        //num2 = Float.parseFloat(second_field.getText().toString());

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
       // switch (v.getId()) {
            //case R.id.button:
            //oper = "+";
            //result = num1 + num2;
            //break;


        button?.setOnClickListener {
            if(second_field?.text?.toString()?.trim()?.equals("")!!){
                Toast.makeText(this, "67", Toast.LENGTH_SHORT).show()
            }
        }



    }
}
