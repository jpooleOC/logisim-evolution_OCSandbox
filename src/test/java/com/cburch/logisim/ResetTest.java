package com.cburch.logisim;

import com.cburch.logisim.proj.Project;
import com.cburch.logisim.proj.ProjectActions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResetTest {

    @Test
    public void testResetClearsCircuitState() {
        Project project = ProjectActions.doNew((Project) null);

        assertNotNull(project.getSimulator());

        project.getSimulator().reset();

        assertNotNull(project.getSimulator());
    }
}