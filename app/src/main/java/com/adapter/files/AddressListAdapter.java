package com.adapter.files;

import android.content.Context;
import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.alaadcin.user.R;
import com.general.files.GeneralFunctions;
import com.view.MTextView;

import java.util.ArrayList;
import java.util.HashMap;

public class AddressListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public GeneralFunctions generalFunctions;
    public ItemClickListener clickListener;
    ArrayList<HashMap<String, String>> deliveryList;
    Context mContext;


    public AddressListAdapter(Context mContext, ArrayList<HashMap<String, String>> deliveryList, GeneralFunctions generalFunctions) {
        this.deliveryList = deliveryList;
        this.mContext = mContext;
        this.generalFunctions = generalFunctions;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_address_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        setData((ViewHolder) holder, position, false);
    }

    private void setData(ViewHolder holder, final int position, boolean isSelected) {
        final HashMap<String, String> item = deliveryList.get(position);
        final ViewHolder viewHolder = (ViewHolder) holder;

        String vAddressType = item.get("vAddressType");

        if (vAddressType != null && !vAddressType.equals("")) {
            viewHolder.tAddressTxt.setText(vAddressType + "\n" + item.get("vBuildingNo") + ", " + item.get("vLandmark") + "\n" + item.get("vServiceAddress"));
        } else {
            viewHolder.tAddressTxt.setText(item.get("vBuildingNo") + ", " + item.get("vLandmark") + "\n" + item.get("vServiceAddress"));
        }

        viewHolder.radioImg.setOnClickListener(view -> viewHolder.deliveryAddrArea.performClick());

        if (item.get("isSelected").equals("false")) {
            viewHolder.radioImg.setImageResource(R.drawable.ic_non_selected);
        } else {
            viewHolder.radioImg.setImageResource(R.drawable.ic_selected);
        }
 
        String eLocationAvailable=item.get("eLocationAvailable");
        viewHolder.deliveryAddrArea.setOnClickListener(view -> {
            if (eLocationAvailable != null && eLocationAvailable.equalsIgnoreCase("No")) {
                return;
            }

            viewHolder.radioImg.setImageResource(R.drawable.ic_selected);
            if (clickListener != null) {
                clickListener.setOnClick(position);
            }
        });
        viewHolder.imgdelete.setOnClickListener(view -> {
            if (clickListener != null) {
                clickListener.setOnDeleteClick(position);
            }
        });

        if (eLocationAvailable != null && eLocationAvailable.equalsIgnoreCase("Yes")) {
//            viewHolder.deliveryAddrArea.setBackgroundColor(Color.parseColor("#FFFFFF"));
            viewHolder.tAddressTxt.setTextColor(mContext.getResources().getColor(R.color.black));
            viewHolder.radioImg.setEnabled(true);
            viewHolder.radioImg.setFocusable(true);
            viewHolder.radioImg.setFocusableInTouchMode(true);
            viewHolder.addressNotAvailTxtView.setVisibility(View.GONE);
        } else if (eLocationAvailable != null && eLocationAvailable.equalsIgnoreCase("No")) {
//            viewHolder.deliveryAddrArea.setBackgroundColor(Color.parseColor("#dadada"));
            int color=Color.parseColor("#808080");
            viewHolder.tAddressTxt.setTextColor(color);
            viewHolder.radioImg.setColorFilter(color);
            viewHolder.radioImg.setEnabled(false);
            viewHolder.radioImg.setFocusable(false);
            viewHolder.radioImg.setFocusableInTouchMode(false);
            viewHolder.addressNotAvailTxtView.setVisibility(View.VISIBLE);
            viewHolder.addressNotAvailTxtView.setText(item.get("LBL_SERVICE_NOT_AVAIL_ADDRESS_RESTRICT"));
        }
    }

    @Override
    public int getItemCount() {
        return deliveryList.size();
    }

    public void onClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void setOnClick(int position);

        void setOnDeleteClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView radioImg;
        MTextView vAreaTxt;
        MTextView tAddressTxt;
        MTextView vCityTxt;
        MTextView vPostcodeTxt;
        MTextView vContryTxt;
        MTextView vApartmentTxt;
        MTextView addressNotAvailTxtView;
        ImageView imgdelete;

        LinearLayout deliveryAddrArea;

        public ViewHolder(View itemView) {
            super(itemView);

            radioImg = (ImageView) itemView.findViewById(R.id.radioImg);

            vAreaTxt = (MTextView) itemView.findViewById(R.id.vAreaTxt);
            tAddressTxt = (MTextView) itemView.findViewById(R.id.tAddressTxt);
            vCityTxt = (MTextView) itemView.findViewById(R.id.vCityTxt);
            vPostcodeTxt = (MTextView) itemView.findViewById(R.id.vPostcodeTxt);
            vContryTxt = (MTextView) itemView.findViewById(R.id.vContryTxt);
            vApartmentTxt = (MTextView) itemView.findViewById(R.id.vApartmentTxt);
            addressNotAvailTxtView = (MTextView) itemView.findViewById(R.id.addressNotAvailTxtView);
            imgdelete = (ImageView) itemView.findViewById(R.id.imgdelete);

            deliveryAddrArea = (LinearLayout) itemView.findViewById(R.id.deliveryAddrArea);

        }
    }
}
