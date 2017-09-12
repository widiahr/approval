package com.example.april.approval.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.april.approval.R;
import com.example.april.approval.model.SemuapaketItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Aprilia on 08/09/2017.
 */

public class PaketAdapter extends RecyclerView.Adapter<PaketAdapter.PaketHolder> {
    Context mContext;
    List<SemuapaketItem> semuapaketItemList;

//    public String[] mColors = {
//            "#39add1", // light blue
//            "#3079ab", // dark blue
//            "#c25975", // mauve
//            "#e15258", // red
//            "#f9845b", // orange
//            "#838cc7", // lavender
//            "#7d669e", // purple
//            "#53bbb4", // aqua
//            "#51b46d", // green
//            "#e0ab18", // mustard
//            "#637a91", // dark gray
//            "#f092b0", // pink
//            "#b7c0c7"  // light gray
//    };


    public PaketAdapter(Context context, List<SemuapaketItem> paketList) {
        this.mContext = context;
        semuapaketItemList = paketList;
    }

    @Override
    public PaketAdapter.PaketHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_paket, parent, false);
        return new PaketHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PaketAdapter.PaketHolder holder, int position) {
        final SemuapaketItem semuapaketItem = semuapaketItemList.get(position);
        holder.txttanggalDet.setText(semuapaketItem.getDate());
        holder.txtidPickUpDet.setText(semuapaketItem.getKodePengiriman());
        holder.txtNamaPenerimaDet.setText(semuapaketItem.getPenerima());
//        holder.txtKontakPenerimaDet.setText(semuapaketItem.getTelpPenerima());
//        holder.txtAlamat1Det.setText(semuapaketItem.getAlamatPenerima());
//        holder.txtJenisBarangDet.setText(semuapaketItem.getJenisBarang());
//        holder.txtQtyDet.setText(semuapaketItem.getQty());
//        holder.txtWidthDet.setText(semuapaketItem.getWidth());
//        holder.txtLengthDet.setText(semuapaketItem.getLength());
//        holder.txtHeightDet.setText(semuapaketItem.getHeight());

//        String date = semuapaketItem.getDate();
//        String firstCharDate = date.substring(0, 1);
//        TextDrawable drawable = TextDrawable.builder()
//                .buildRound(firstCharDate, getColor());

    }

    @Override
    public int getItemCount() {
        return semuapaketItemList.size();
    }

    public class PaketHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txttanggalDet)
        TextView txttanggalDet;
        @BindView(R.id.txtidPickUpDet)
        TextView txtidPickUpDet;
        @BindView(R.id.txtNamaPenerimaDet)
        TextView txtNamaPenerimaDet;
//        @BindView(R.id.txtKontakPenerimaDet)
//        TextView txtKontakPenerimaDet;
//        @BindView(R.id.txtAlamat1Det)
//        TextView txtAlamat1Det;
//        @BindView(R.id.txtJenisBarangDet)
//        TextView txtJenisBarangDet;
//        @BindView(R.id.txtQtyDet)
//        TextView txtQtyDet;
//        @BindView(R.id.txtWidthDet)
//        TextView txtWidthDet;
//        @BindView(R.id.txtLengthDet)
//        TextView txtLengthDet;
//        @BindView(R.id.txtHeightDet)
//        TextView txtHeightDet;
//        @BindView(R.id.txtKetDet)
//        TextView txtKetDet;

        public PaketHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

//    public int getColor() {
//        String color;
//
//        // Randomly select a fact
//        Random randomGenerator = new Random(); // Construct a new Random number generator
//        int randomNumber = randomGenerator.nextInt(mColors.length);
//
//        color = mColors[randomNumber];
//        int colorAsInt = Color.parseColor(color);
//
//        return colorAsInt;
//    }
}


