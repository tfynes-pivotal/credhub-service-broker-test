@RestController
class PortTest {
  @RequestMapping("/")
    String index() {
      String retVal = System.getenv("VCAP_SERVICES") + "\n";
    }
}
