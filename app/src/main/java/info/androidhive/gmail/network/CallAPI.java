package info.androidhive.gmail.network;

import android.os.AsyncTask;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by energywin4 on 3/11/2017.
 */

public class CallAPI extends AsyncTask<String,String,String> {
    public CallAPI(){

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {

        String urlString=params[0]; //url TO CALL
        String urlParams=params[1];//data to post

        OutputStream out=null;
        try
        {
            URL url=new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            out = new BufferedOutputStream(urlConnection.getOutputStream());

            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(out, "UTF-8"));

            writer.write(urlParams);

            writer.flush();

            writer.close();

            out.close();

            urlConnection.connect();

        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
        return null;
    }
}
