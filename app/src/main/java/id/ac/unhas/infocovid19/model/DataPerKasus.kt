package id.ac.unhas.infocovid19.model

import com.google.gson.annotations.SerializedName

data class DataPerkasus(
    @SerializedName("data")
    val data: List<PerKasus?>?
) {
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach {
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class PerKasus(

    @SerializedName("id_pasien")
    val id_pasien: Int?,
    @SerializedName("hasil_lab")
    val hasil_lab: String?,
    @SerializedName("kode_pasien")
    val kode_pasien: Int?,
    @SerializedName("provinsi")
    val provinsi: Int?,
    @SerializedName("long")
    val long: Double?,
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("jenis_kelamin")
    val jenis_kelamin: String?,
    @SerializedName("umur")
    val umur: Int?,
    @SerializedName("cluster")
    val cluster: Int?,
    @SerializedName("keterangan")
    val keterangan: String?,
    @SerializedName("status_pasien")
    val status_pasien: Int?,
    @SerializedName("keterangan_status")
    val keterangan_status: String?,
    @SerializedName("wn")
    val wn: Int?,
    @SerializedName("detail_wn")
    val detail_wn: String?,
    @SerializedName("jenis_kasus")
    val jenis_kasus: Int?,
    @SerializedName("tampilkan")
    val tampilkan: Int?,
    @SerializedName("added_date")
    val added_date: String?,
    @SerializedName("garis_penularan")
    val garis_penularan: String?
) {
    override fun toString(): String {
        return "Pasien ke -${this.id_pasien}[#hasil lab: ${this.hasil_lab}, #kode pasien: ${this.kode_pasien}, " +
                "#provinsi: ${this.provinsi}, #long:${this.long}, #lat: ${this.lat}, #jeniskelamin:${this.jenis_kelamin},  " +
                "#umur: ${this.umur}, #cluster:${this.cluster}, #keterangan: ${this.keterangan}, #status pasien:${this.status_pasien}" +
                "#keterangan status: ${this.keterangan_status}, #wn:${this.wn}, #detail wn: ${this.detail_wn}, #jenis kasus:${this.jenis_kasus}" +
                "#tampilkan: ${this.tampilkan}, #added date:${this.added_date}, #garis penularan: ${this.garis_penularan}]"
    }
}