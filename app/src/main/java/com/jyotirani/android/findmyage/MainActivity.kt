package com.jyotirani.android.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  protected fun calculateButtonSelected(view: View) {
   // Toast.makeText(this,"Calculate Button Selected",Toast.LENGTH_SHORT).show()
    val YEAR = yearField.text.toString()
    if (YEAR.isEmpty()) {
      Toast.makeText(this,"Year should not be blank",Toast.LENGTH_SHORT).show()
    } else {
      val BIRTH_YEAR = YEAR.toInt()
      val CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR)
      if (BIRTH_YEAR < CURRENT_YEAR){
        messageTextView.setText("You are ${CURRENT_YEAR - BIRTH_YEAR} years old.")
      } else if (BIRTH_YEAR == CURRENT_YEAR) {
        messageTextView.setText("You are less than 1 year.")
      } else {
        Toast.makeText(this,"You have not born yet Brother!",Toast.LENGTH_SHORT).show()
      }
    }
    // Toast.makeText(this,"Year = $YEAR",Toast.LENGTH_SHORT).show()
  }
}
