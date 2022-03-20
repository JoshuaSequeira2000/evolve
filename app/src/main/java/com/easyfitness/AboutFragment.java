package com.easyfitness;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.easyfitness.DAO.DatabaseHelper;
import com.easyfitness.licenses.CustomLicense;

import de.psdev.licensesdialog.LicensesDialog;
import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.BSD3ClauseLicense;
import de.psdev.licensesdialog.licenses.GnuLesserGeneralPublicLicense21;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.licenses.MITLicense;
import de.psdev.licensesdialog.model.Notice;

public class AboutFragment extends Fragment {
    private String name;
    private int id;
    private MainActivity mActivity = null;

    private final View.OnClickListener clickLicense = v -> {

        String name = null;
        String url = null;
        String copyright = null;
        License license = null;



        final Notice notice = new Notice(name, url, copyright, license);
        new LicensesDialog.Builder(getMainActivity())
                .setNotices(notice)
                .build()
                .show();
    };

    /**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static AboutFragment newInstance(String name, int id) {
        AboutFragment f = new AboutFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putInt("id", id);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mActivity = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_about, container, false);

        TextView mpDBVersionTextView = view.findViewById(R.id.database_version);
        mpDBVersionTextView.setText(Integer.toString(DatabaseHelper.DATABASE_VERSION));

        TextView mpMPAndroidChartTextView = view.findViewById(R.id.MPAndroidChart);
        TextView mpJavaCVSTextView = view.findViewById(R.id.javaCSV);
        TextView mpLicenseDialogTextView = view.findViewById(R.id.LicensesDialog);
        TextView mpChronometerTextView = view.findViewById(R.id.antoniomChronometer);
        TextView mpMaterialIntroTextView = view.findViewById(R.id.MaterialIntro);
        TextView mpTimePickerWithSecondsTextView = view.findViewById(R.id.TimePickerWithSeconds);
        TextView mpSmartTabLayoutTextView = view.findViewById(R.id.SmartTabLayout);
        TextView mpFlaticonTextView = view.findViewById(R.id.flaticonCredits);
        TextView mpFreepikView = view.findViewById(R.id.freepikCredits);
        TextView mpCircleProgressView = view.findViewById(R.id.CircleProgress);
        TextView mpCircularImageView = view.findViewById(R.id.CircularImageView);
        TextView mpkToast = view.findViewById(R.id.ktoast);
        TextView mpSweetAlertDialog = view.findViewById(R.id.SweetAlertDialog);
        TextView mpMaterialFavoriteButton = view.findViewById(R.id.MaterialFavoriteButton);
        TextView mpFastNFitnesss = view.findViewById(R.id.FastNFitness);


        mpMPAndroidChartTextView.setOnClickListener(clickLicense);
        mpJavaCVSTextView.setOnClickListener(clickLicense);
        mpLicenseDialogTextView.setOnClickListener(clickLicense);
        mpChronometerTextView.setOnClickListener(clickLicense);
        mpMaterialIntroTextView.setOnClickListener(clickLicense);
        mpTimePickerWithSecondsTextView.setOnClickListener(clickLicense);
        mpSmartTabLayoutTextView.setOnClickListener(clickLicense);
        mpFlaticonTextView.setOnClickListener(clickLicense);
        mpFreepikView.setOnClickListener(clickLicense);
        mpCircleProgressView.setOnClickListener(clickLicense);
        mpCircularImageView.setOnClickListener(clickLicense);
        mpkToast.setOnClickListener(clickLicense);
        mpSweetAlertDialog.setOnClickListener(clickLicense);
        mpMaterialFavoriteButton.setOnClickListener(clickLicense);
        mpFastNFitnesss.setOnClickListener(clickLicense);

        // Inflate the layout for this fragment
        return view;
    }

    public MainActivity getMainActivity() {
        return this.mActivity;
    }

}

