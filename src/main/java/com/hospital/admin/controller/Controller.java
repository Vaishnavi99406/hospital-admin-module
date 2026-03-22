@RestController
@RequestMapping("/api/admin/doctor")
public class AdminDoctorController {

    @Autowired
    private DoctorService doctorService;

    // ✅ Approve API
    @PutMapping("/{id}/approve")
    public Doctor approveDoctor(@PathVariable Long id) {
        return doctorService.approveDoctor(id);
    }

    // ❌ Reject API
    @PutMapping("/{id}/reject")
    public Doctor rejectDoctor(@PathVariable Long id) {
        return doctorService.rejectDoctor(id);
    }
}
