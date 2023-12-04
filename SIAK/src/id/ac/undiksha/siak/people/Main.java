package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");
		
		Dosen Yudhi = new Dosen();
		
		deva.setNidn("45678");
		deva.setNama("Yudhi");
		deva.setAlamat("Singaraja");
		deva.setTanggalLahir("30 Juli 1990");
		deva.setJenisKelamin(false);
		deva.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		
		
		System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());
		
		
		System.out.println (Yudhi.getNidn());
		System.out.println (Yudhi.getNama());
		System.out.println (Yudhi.getAlamat());
		System.out.println (Yudhi.getTanggalLahir());
		System.out.println (Yudhi.getJenisKelamin());
		System.out.println (Yudhi.getMatakuliah());
		
		
		/*ani.nim 	="12345";
		ani.nama	= "Ani";
		ani.alamat	="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
	}
}