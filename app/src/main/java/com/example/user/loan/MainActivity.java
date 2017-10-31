package com.example.user.loan;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String LOAN_STATUS = "status";
    public static final String LOAN_PAYMENT = "payment ";
    //TODO : declare global variable here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO : Linking UI to programme here

    }

    public void calculateLoan(View view){
        String status = "Approve";
        double monthlyPayment = 450.0;

        //Intend = a object to transfer control
        //from one activity to another activity
        Intent intent = new Intent(this,ResultActivity.class);

        //putEztra method is used to pass data to another
        //activity.Forrmat putExtra (TAG,Value)
        intent.putExtra(LOAN_STATUS,status);
        intent.putExtra(LOAN_PAYMENT,monthlyPayment);

        //to start a new activity
        startActivity(intent);
    }


}
