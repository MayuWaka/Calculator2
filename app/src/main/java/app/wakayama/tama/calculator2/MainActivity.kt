package app.wakayama.tama.calculator2

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //1番目に入力される変数をつくる
    var firstNumber = 0
    //2番目に入力される変数をつくる
    var secondNumber = 0
    //合計を入れる変数をつくる
    var totalNumber = 0
    //符号の入力状態を持つ変数を、最初はからで作る
    var operator = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画面起動時は符号ボタンと等号ボタンを灰色にする
        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

        //画面起動時は符号ボタンと等号ボタンを利用できないようにする
        plusButton.isEnabled = false
        minusButton.isEnabled = false
        multiplyButton.isEnabled = false
        equalButton.isEnabled = false

        //①番目に入力される変数をTextViewに反映する
        numberText.text = firstNumber.toString()

        numberButton0.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+0
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+0
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }


        //ボタン1がタップされたら
        numberButton1.setOnClickListener {
            //符号入力状態を持つ変数が、emptyか、そうでないかで処理を分ける
            if (operator == "empty"){

                //1番目に入力された数字を10倍にして1を足し算する
                firstNumber = firstNumber*10+1
                //数字を表示するTextViewに反映する
                numberText.text = firstNumber.toString()

                //＋－×ボタンを黄色にする
                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                //符号、等号ボタンを利用できないようにする
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                //2番目に入力された数字を10倍にして1を足し算する
                secondNumber = secondNumber*10+1
                //数字を表示するTextViewに反映する
                numberText.text=secondNumber.toString()
                //等号ボタンを黄色にする
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton2.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+2
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+2
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton3.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+3
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+3
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton4.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+4
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+4
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton5.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+5
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+5
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton6.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+6
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+6
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton7.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+7
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+7
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton8.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+8
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+8
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        numberButton9.setOnClickListener {
            if (operator == "empty"){

                firstNumber = firstNumber*10+9
                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true
            }

            else{
                secondNumber = secondNumber*10+9
                numberText.text=secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

            }
        }

        plusButton.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))

            minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            //符号をいれる変数に＋を表す「plus」トイウモジを入れる
            operator = "plus"
            //二番目に入力された文字をTextViewに反映する
            numberText.text = secondNumber.toString()
        }

        minusButton.setOnClickListener {
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))

            plusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            //符号をいれる変数に＋を表す「plus」トイウモジを入れる
            operator = "minus"
            //二番目に入力された文字をTextViewに反映する
            numberText.text = secondNumber.toString()
        }

        multiplyButton.setOnClickListener {
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))

            minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            plusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            //符号をいれる変数に＋を表す「plus」トイウモジを入れる
            operator = "multiply"
            //二番目に入力された文字をTextViewに反映する
            numberText.text = secondNumber.toString()
        }

        equalButton.setOnClickListener {
            if (operator == "plus"){
                //+なら足し算する
                totalNumber = firstNumber + secondNumber
            } else if (operator == "minus"){
                totalNumber = firstNumber - secondNumber
            } else if (operator == "multiply"){
                totalNumber = firstNumber * secondNumber
            }
            //符号、等号ボタンを灰色に
            plusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))

            //初期化する
            firstNumber = 0
            secondNumber = 0
            //符号の入力状態を持つ変数を、からにセット（初期化する）
            operator = "empty"
            //合計をTextViewに表示
            numberText.text = totalNumber.toString()
        }

        clearButton.setOnClickListener {
            plusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList =  ColorStateList.valueOf(Color.rgb(150,150,150))

            //初期化する
            firstNumber = 0
            secondNumber = 0
            totalNumber = 0
            //符号の入力状態を持つ変数を、からにセット（初期化する）
            operator = "empty"
            //合計をTextViewに表示
            numberText.text = totalNumber.toString()
        }


    }
}
