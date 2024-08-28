 seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if(amount.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Enter amount", Toast.LENGTH_SHORT).show();
                }
                else {

                    seekresult.setText(seekBar.getProgress()+"%");
                    Double userInput = Double.parseDouble(amount.getText().toString());

                    Double val = userInput -((userInput*seekBar.getProgress())/100);
                    result.setText(Double.toString(val));

                    if(seekBar.getProgress() > 75){
                        seekresult.setTextColor(Color.RED);
                        seekresult.setText("75%");
                        Double vall = userInput-((userInput*75)/100);
                        result.setText(""+vall);
                    }else {
                        seekresult.setTextColor(Color.BLACK);
                    }
                }
            }



calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double userSalary = Double.parseDouble(amount.getText().toString());
                double calculateSalary = 0.0;

                if (amount.equals("")){
                    value.setText("Enter Valid Input");
                }else {
                    if (userSalary<125000){
                        calculateSalary= userSalary - (userSalary * 0.06);
                    }else if (userSalary >= 125000 && userSalary<250000 ){
                        calculateSalary= userSalary - (userSalary * 0.12);
                    }else if (userSalary >= 250000 && userSalary<375000 ){
                        calculateSalary= userSalary - (userSalary * 0.18);
                    }else if (userSalary >= 375000 && userSalary<500000 ){
                        calculateSalary= userSalary - (userSalary * 0.24);
                    }else if (userSalary >= 500000 && userSalary<6250000 ){
                        calculateSalary= userSalary - (userSalary * 0.30);
                    }else if (userSalary >= 625000 && userSalary<7500000 ){
                        calculateSalary= userSalary - (userSalary * 0.30);
                    }else {
                    value.setText("Enter valid Amount");
                    }
                }
                value.setText("your salary RS: "+ calculateSalary+ "/-");
            }
        });


 button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Amount = Float.parseFloat(amount.getText().toString());

                if (usd.isChecked()){
                    float answer = Amount/324;
                    result.setText("$"+answer+"/=");
                } else if (lkr.isChecked()) {
                    float answer = Amount * 324;
                    result.setText("RS."+answer+"/=");
                }else {
                    result.setText("falt");
                }
            }
        });



 plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float answer = n1 + n2;
                ruslt.setText("=" + answer);
            }
        });


