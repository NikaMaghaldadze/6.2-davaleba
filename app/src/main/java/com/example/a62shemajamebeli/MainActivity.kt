package com.example.a62shemajamebeli
import java.util.Scanner
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private var operand: Double = 0.0
    private var operation: String =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }
    fun numberclick(clickedView: View) {

        if (clickedView is TextView) {

            var result = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (result == "0") {
                result = ""
            }

            resultTextView.text = result + number

        }

    }

    fun operationClick(clickedView: View) {
        if (clickedView is TextView) {

            val result = resultTextView.text.toString()

            if (result.isNullOrEmpty()) {
                this.operand = result.toDouble()
            }

            this.operation = clickedView.text.toString()

            resultTextView.text = ""
        }


    }
    fun Sqrt(){
        val input=Scanner(System.)
        val number =input.nextDouble()
        println("number = ${Math.sqrt(number)}")

    }

    fun equalsClick(clickedView: View) {
        if (clickedView is TextView){
            val secondOperandText = resultTextView.text.toString()
            val secondOperand :Double=0.0

        if (secondOperandText.isNotEmpty()){
            val secondOperand=secondOperandText.toDouble()
        }
            when(operation){
                "+"->resultTextView.text=(operand+secondOperand).toString()
                "-"->resultTextView.text=(operand-secondOperand).toString()
                "*"->resultTextView.text=(operand*secondOperand).toString()
                "/"->resultTextView.text=(operand/secondOperand).toString()
                "√"->resultTextView.text= sqrt(operand).toString()
            }


        }


    }



}





