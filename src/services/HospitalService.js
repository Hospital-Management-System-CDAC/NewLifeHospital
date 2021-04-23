import axios from "axios";

const HOSPITAL_API_BASE_URL = "http://localhost:8080/api/v1";

class HospitalService {
  listUsers() {
    return axios.get(HOSPITAL_API_BASE_URL + "/patients");
  }

  createPatient(patient) {
    return axios.post(HOSPITAL_API_BASE_URL + "/process_register", patient);
  }

  getPatientById(patientId, password) {
    return axios.post(
      HOSPITAL_API_BASE_URL +
        "/dologin?email=" +
        patientId +
        "&password=" +
        password
    );
  }

  updatePatient(patient) {
    return axios.put(HOSPITAL_API_BASE_URL + "/update_patient", patient);
  }

  deletePatient(patientId) {
    return axios.delete(
      HOSPITAL_API_BASE_URL + "/patients/?userid=" + patientId
    );
  }

  getThemById(patient_id) {
    return axios.get(HOSPITAL_API_BASE_URL + "/patients?patient_id");
  }
  processAppointment(appoinment) {
    return axios.post(
      HOSPITAL_API_BASE_URL + "/processAppointment",
      appoinment
    );
  }

  listAppointments() {
    return axios.get(HOSPITAL_API_BASE_URL + "/appointment");
  }

  deleteAppointment(appointmentId) {
    return axios.delete(HOSPITAL_API_BASE_URL + "/" + appointmentId);
  }
  getAdminById(userId, password) {
    return axios.get(
      HOSPITAL_API_BASE_URL +
        "/doadminlogin?userid=" +
        userId +
        "&password=" +
        password
    );
  }

  processLab(lab) {
    return axios.post(HOSPITAL_API_BASE_URL + "/processLab", lab);
  }

  listLab() {
    return axios.get(HOSPITAL_API_BASE_URL + "/appointment");
  }
}

export default new HospitalService();
