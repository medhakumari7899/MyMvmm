package com.example.mymvm.Fragement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.example.mymvm.R;
import com.google.android.material.textfield.TextInputEditText;


public class Home_Fragement extends Fragment {
    TextInputEditText firstname,lastname,currentcity,postalcode,phonenumber,emailaddress,skypelinkedin,highestqualification,university,passingyear;
    TextInputEditText totalyearofexperiance,jobtitle,company,companycity,discription,language;
    Spinner day,month,year,highestcarrierlavel,industry,frommomth,fromyear,tomonth,toyear,proficiency;
    Button registerbtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home__fragement, container, false);
        firstname=view.findViewById(R.id.emp_firstname);
        lastname=view.findViewById(R.id.emp_lastname);
        day=view.findViewById(R.id.emp_dobdate);
        month=view.findViewById(R.id.emp_dobmonth);
        year=view.findViewById(R.id.emp_dobyear);
        currentcity=view.findViewById(R.id.emp_currenycity);
        postalcode=view.findViewById(R.id.emp_postalcode);
        phonenumber=view.findViewById(R.id.emp_phoneno);
        emailaddress=view.findViewById(R.id.emp_emailaddress);
        skypelinkedin=view.findViewById(R.id.emp_skypelinkedin);
        highestqualification=view.findViewById(R.id.emp_highestqualification);
        university=view.findViewById(R.id.emp_university);
        passingyear=view.findViewById(R.id.emp_passingyear);
        highestcarrierlavel=view.findViewById(R.id.emp_highestcarrierlevel);
        industry=view.findViewById(R.id.emp_industry);
        totalyearofexperiance=view.findViewById(R.id.emp_toatalyearofexperince);
        jobtitle=view.findViewById(R.id.emp_jobtitle);
        company=view.findViewById(R.id.emp_company);
        companycity=view.findViewById(R.id.emp_companycity);
        frommomth=view.findViewById(R.id.emp_frommonth);
        fromyear=view.findViewById(R.id.emp_fromyear);
        tomonth=view.findViewById(R.id.emp_tomonth);
        toyear=view.findViewById(R.id.emp_toyear);
        discription=view.findViewById(R.id.emp_discription);
        language=view.findViewById(R.id.emp_language);
        proficiency=view.findViewById(R.id.emp_proficiency);





        return view;
    }
}