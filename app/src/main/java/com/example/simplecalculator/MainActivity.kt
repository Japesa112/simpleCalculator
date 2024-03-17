package com.example.simplecalculator

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
   



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           setContentView(R.layout.activity_main)
            val buttonAdd = findViewById<Button>(R.id.btn_add)
            val buttonSub = findViewById<Button>(R.id.btn_sub)
            val buttonMul = findViewById<Button>(R.id.btn_mul)
            val buttonDiv = findViewById<Button>(R.id.btn_div)

            val EditText1 = findViewById<EditText>(R.id.number1)
            val EditText2 = findViewById<EditText>(R.id.number2)
            val textView = findViewById<TextView>(R.id.answer)


            buttonAdd.setOnClickListener {
                if ((EditText1.text.toString().equals("")) or EditText2.text.toString().equals("")){
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Title")
                    builder.setMessage("Please Enter valid number")
                    builder.setPositiveButton("OK") { dialog, which ->
                        // handle OK button click
                    }
                    builder.setNegativeButton("Cancel") { dialog, which ->
                        // handle Cancel button click
                    }
                    val dialog = builder.create()
                    dialog.show()
                }
                else{
                   val str1  = EditText1.text.toString()
                    val str2  = EditText2.text.toString()

                    val num1:Int = str1.toInt()
                    val num2:Int = str2.toInt()

                    val num3: Int = num1 + num2
                    textView.setText("Answer= $num3")

                }

            }
            buttonSub.setOnClickListener {
                if ((EditText1.text.toString().equals("")) or EditText2.text.toString().equals("")){
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Title")
                    builder.setMessage("Please Enter valid number")
                    builder.setPositiveButton("OK") { dialog, which ->
                        // handle OK button click
                    }
                    builder.setNegativeButton("Cancel") { dialog, which ->
                        // handle Cancel button click
                    }
                    val dialog = builder.create()
                    dialog.show()
                }
                else{
                    val str1  = EditText1.text.toString()
                    val str2  = EditText2.text.toString()

                    val num1:Int = str1.toInt()
                    val num2:Int = str2.toInt()

                    val num3: Int = num1 - num2
                    textView.setText("Answer= $num3")

                }
            }
            buttonMul.setOnClickListener {
                if ((EditText1.text.toString().equals("")) or EditText2.text.toString().equals("")){
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Title")
                    builder.setMessage("Please Enter valid number")
                    builder.setPositiveButton("OK") { dialog, which ->
                        // handle OK button click
                    }
                    builder.setNegativeButton("Cancel") { dialog, which ->
                        // handle Cancel button click
                    }
                    val dialog = builder.create()
                    dialog.show()
                }
                else{
                    val str1  = EditText1.text.toString()
                    val str2  = EditText2.text.toString()

                    val num1:Int = str1.toInt()
                    val num2:Int = str2.toInt()

                    val num3: Int = num1 * num2
                    textView.setText("Answer= $num3")

                }

            }
            buttonDiv.setOnClickListener {

                if ((EditText1.text.toString().equals("")) or EditText2.text.toString().equals("")){
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Title")
                    builder.setMessage("Please Enter valid number")
                    builder.setPositiveButton("OK") { dialog, which ->
                        // handle OK button click
                    }
                    builder.setNegativeButton("Cancel") { dialog, which ->
                        // handle Cancel button click
                    }
                    val dialog = builder.create()
                    dialog.show()
                }
                else{
                    val str1  = EditText1.text.toString()
                    val str2  = EditText2.text.toString()

                    val num1:Int = str1.toInt()
                    val num2:Int = str2.toInt()


                    try {
                        val num3: Int = num1 / num2
                        textView.setText("Answer= $num3")
                    }catch(e: ArithmeticException) {
                        textView.setText("Division by zero is not allowed")
                        print(e)
                    }


                }

            }


        }

    }

}



