package com.slier.atsolat.dialog;

import com.slier.atsolat.R;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class About extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view  = inflater.inflate(R.layout.about, null);
        builder.setView(view);
        builder.setPositiveButton("Ok", new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        return builder.create();
    }


}
