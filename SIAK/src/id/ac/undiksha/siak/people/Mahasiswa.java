package id.ac.undiksha.siak.people;

public class Mahasiswa {
	
	private String nim;
	private String nama;
	private String alamat;
	private String prodi;
	private String tanggalLahir;
	private boolean jenisKelamin;
	
public mahasiswa() {
	this.nim 		="<masukan nim>";
	this.nama		="<masukan nama>";
	this.alamat		="<masukan alamat>";
	this.prodi		="<masukan prodi>";
	this.tanggalLahir = "<masukan tanggal lahir>";
	}
	
	public Mahasiswa(
			String nim,
			String nama,
			String alamat,
			String prodi,
			String tanggallahir,
			boolean jeniskelamin
			
	){
		super();
		this.nim 		="<masukan nim>";
		this.nama		="<masukan nama>";
		this.alamat		="<masukan alamat>";
		this.prodi		="<masukan prodi>";
		this.tanggalLahir = "<masukan tanggal lahir>";
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	
	public String getJenisKelamin() {
		if (this.isJenisKelamin()) {
			return "Perempuan";
		}else {
			return "Laki-laki";
		}
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
}