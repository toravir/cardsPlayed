package com.example.cardsplayed

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var allButtons = ArrayList<Button>()
    private var history = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allButtons.add(findViewById(R.id.sAce))
        allButtons.add(findViewById(R.id.sKing))
        allButtons.add(findViewById(R.id.sQueen))
        allButtons.add(findViewById(R.id.sJack))
        allButtons.add(findViewById(R.id.sTen))
        allButtons.add(findViewById(R.id.sNine))
        allButtons.add(findViewById(R.id.sEight))
        allButtons.add(findViewById(R.id.sSeven))
        allButtons.add(findViewById(R.id.sSix))
        allButtons.add(findViewById(R.id.sFive))
        allButtons.add(findViewById(R.id.sFour))
        allButtons.add(findViewById(R.id.sThree))
        allButtons.add(findViewById(R.id.sTwo))


        allButtons.add(findViewById(R.id.cAce))
        allButtons.add(findViewById(R.id.cKing))
        allButtons.add(findViewById(R.id.cQueen))
        allButtons.add(findViewById(R.id.cJack))
        allButtons.add(findViewById(R.id.cTen))
        allButtons.add(findViewById(R.id.cNine))
        allButtons.add(findViewById(R.id.cEight))
        allButtons.add(findViewById(R.id.cSeven))
        allButtons.add(findViewById(R.id.cSix))
        allButtons.add(findViewById(R.id.cFive))
        allButtons.add(findViewById(R.id.cFour))
        allButtons.add(findViewById(R.id.cThree))
        allButtons.add(findViewById(R.id.cTwo))

        allButtons.add(findViewById(R.id.hAce))
        allButtons.add(findViewById(R.id.hKing))
        allButtons.add(findViewById(R.id.hQueen))
        allButtons.add(findViewById(R.id.hJack))
        allButtons.add(findViewById(R.id.hTen))
        allButtons.add(findViewById(R.id.hNine))
        allButtons.add(findViewById(R.id.hEight))
        allButtons.add(findViewById(R.id.hSeven))
        allButtons.add(findViewById(R.id.hSix))
        allButtons.add(findViewById(R.id.hFive))
        allButtons.add(findViewById(R.id.hFour))
        allButtons.add(findViewById(R.id.hThree))
        allButtons.add(findViewById(R.id.hTwo))


        allButtons.add(findViewById(R.id.dAce))
        allButtons.add(findViewById(R.id.dKing))
        allButtons.add(findViewById(R.id.dQueen))
        allButtons.add(findViewById(R.id.dJack))
        allButtons.add(findViewById(R.id.dTen))
        allButtons.add(findViewById(R.id.dNine))
        allButtons.add(findViewById(R.id.dEight))
        allButtons.add(findViewById(R.id.dSeven))
        allButtons.add(findViewById(R.id.dSix))
        allButtons.add(findViewById(R.id.dFive))
        allButtons.add(findViewById(R.id.dFour))
        allButtons.add(findViewById(R.id.dThree))
        allButtons.add(findViewById(R.id.dTwo))


        for (b in allButtons) {
            b.setTextColor(Color.WHITE)
            b.setBackgroundColor(Color.BLACK)
            b.setOnClickListener(this)
        }

        val undoButton = findViewById<Button>(R.id.buttonUndo)
        undoButton.setOnClickListener {
            for (h in history) {
                h.setBackgroundColor(Color.BLACK)
                history.remove(h)
                break
            }
        }

        val resetButton = findViewById<Button>(R.id.resetb)
        resetButton.setOnClickListener {
            for (h in history) {
                h.setBackgroundColor(Color.BLACK)
            }
            history.clear()
        }
    }

    override fun onClick(v: View) {
        if (history.indexOf(v) == -1) {
            history.add(0, v)
            v.setBackgroundColor(Color.WHITE)
        }
    }
}