package id.ac.unhas.infocovid19.model

import com.google.gson.annotations.SerializedName

data class DataHarian(
    @SerializedName("data")
    val data: List<Harian?>?
) {
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach {
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class Harian(

    @SerializedName("harike")
    val harike: String?,
    @SerializedName("tanggal")
    val tanggal: Long?,
    @SerializedName("jumlahKasusBaruperHari")
    val jumlahKasusBaruperHari: Int?,
    @SerializedName("jumlahKasusKumulatif")
    val jumlahKasusKumulatif: Int?,
    @SerializedName("jumlahpasiendalamperawatan")
    val jumlahpasiendalamperawatan: Int?,
    @SerializedName("persentasePasiendalamPerawatan")
    val persentasePasiendalamPerawatan: Double?,
    @SerializedName("jumlahPasienSembuh")
    val jumlahPasienSembuh: Int?,
    @SerializedName("persentasePasienSembuh")
    val persentasePasienSembuh: Double?,
    @SerializedName("jumlahPasienMeninggal")
    val jumlahPasienMeninggal: Int?,
    @SerializedName("persentasePasienMeninggal")
    val persentasePasienMeninggal: Double?,
    @SerializedName("jumlahKasusSembuhperHari")
    val jumlahKasusSembuhperHari: Int?,
    @SerializedName("jumlahKasusMeninggalperHari")
    val jumlahKasusMeninggalperHari: Int?,
    @SerializedName("jumlahKasusDirawatperHari")
    val jumlahKasusDirawatperHari: Int?,
    @SerializedName("fid")
    val fid: Int?
) {
    override fun toString(): String {
        return "Hari ke - ${this.harike}[tanggal: ${this.tanggal}, " +
                "#Jumlah Kasus Baru Per Hari : ${this.jumlahKasusBaruperHari}, " +
                "#Jumlah Kasus Kumulatif: ${this.jumlahKasusKumulatif}, " +
                "#Jumlah Pasien Dalam Perawatan:${this.jumlahpasiendalamperawatan}, " +
                "#Persentase Pasien Dalam Perawatan: ${this.persentasePasiendalamPerawatan}, " +
                "#jumlah Pasien Sembuh:${this.jumlahPasienSembuh}, " +
                "#Persentase Pasien Sembuh: ${this.persentasePasienSembuh}, " +
                "#Jumlah Pasien Meninggal:${this.jumlahPasienMeninggal}, " +
                "#Persentase Pasien Meninggal: ${this.persentasePasienMeninggal}, " +
                "#Jumlah Kasus Sembuh Per hari:${this.jumlahKasusSembuhperHari}, " +
                "#Jumlah Kasus Meninggal Perhari: ${this.jumlahKasusMeninggalperHari}, " +
                "#Jumlah Kasus Dirawat Per Hari:${this.jumlahKasusDirawatperHari}, " +
                "#fid: ${this.fid}]"
    }
}