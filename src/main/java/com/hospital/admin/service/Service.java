@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // ✅ Approve Doctor
    public Doctor approveDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        doctor.setDoctorStatus("APPROVED");
        return doctorRepository.save(doctor);
    }

    // ❌ Reject Doctor
    public Doctor rejectDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        doctor.setDoctorStatus("REJECTED");
        return doctorRepository.save(doctor);
    }
}
