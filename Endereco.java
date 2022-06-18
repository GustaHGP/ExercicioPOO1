package ExerciciosPOO;

public class Endereco {
private String cep;
private String tipologradouro;
private String logradouro;
private String complemento;
private String bairro;
private String cidade;
private String estado;
private double longitude;
private double latitude;

public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getTipologradouro() {
	return tipologradouro;
}
public void setTipologradouro(String tipologradouro) {
	this.tipologradouro = tipologradouro;
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}

public Endereco(String cep, String tipologradouro, String logradouro, String complemento, String bairro,
		String cidade, String estado, double longitude, double latitude) {
	super();
	this.cep = cep;
	this.tipologradouro = tipologradouro;
	this.logradouro = logradouro;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
	this.longitude = longitude;
	this.latitude = latitude;
}
public Endereco(double longitude, double latitude) {
	super();
	this.longitude = longitude;
	this.latitude = latitude;
}
public Endereco(String cep, String tipologradouro, String logradouro, String bairro, String cidade, String estado) {
	super();
	this.cep = cep;
	this.tipologradouro = tipologradouro;
	this.logradouro = logradouro;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
}
public Endereco(String cep, String tipologradouro, String logradouro, String complemento, String bairro,
		String cidade, String estado) {
	super();
	this.cep = cep;
	this.tipologradouro = tipologradouro;
	this.logradouro = logradouro;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
}
public Endereco(String cep) {
	super();
	this.cep = cep;
}
public Endereco() {
	super();
}

@Override
public String toString() {

	return (""+tipologradouro+" "+logradouro+"- "+bairro+","+cidade+"- "+estado+","+cep+"");

}

}
