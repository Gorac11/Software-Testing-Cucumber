/**
 * 
 */
package uni.fmi.testing_ivan_final;
/**
 * 
 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Lenovo
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
							plugin = { "pretty", "html:target/rapports" },
							monochrome = true)
public class CucumberStarter {

}
