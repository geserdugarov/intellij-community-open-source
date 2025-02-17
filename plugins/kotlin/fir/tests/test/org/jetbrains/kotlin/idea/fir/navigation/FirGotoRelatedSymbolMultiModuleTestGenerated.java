// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.kotlin.idea.fir.navigation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.base.plugin.KotlinPluginMode;
import org.jetbrains.kotlin.idea.base.test.TestRoot;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

/**
 * This class is generated by {@link org.jetbrains.kotlin.testGenerator.generator.TestGenerator}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("fir/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("../../idea/tests/testData/navigation/relatedSymbols/multiModule")
public class FirGotoRelatedSymbolMultiModuleTestGenerated extends AbstractFirGotoRelatedSymbolMultiModuleTest {
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final KotlinPluginMode getPluginMode() {
        return KotlinPluginMode.K2;
    }

    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("fromActualMemberFunToExpect")
    public void testFromActualMemberFunToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromActualMemberFunToExpect/");
    }

    @TestMetadata("fromActualMemberValToExpect")
    public void testFromActualMemberValToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromActualMemberValToExpect/");
    }

    @TestMetadata("fromExpectMemberFunToActuals")
    public void testFromExpectMemberFunToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromExpectMemberFunToActuals/");
    }

    @TestMetadata("fromExpectMemberValToActuals")
    public void testFromExpectMemberValToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromExpectMemberValToActuals/");
    }

    @TestMetadata("fromNestedActualClassToExpect")
    public void testFromNestedActualClassToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromNestedActualClassToExpect/");
    }

    @TestMetadata("fromNestedExpectClassToActuals")
    public void testFromNestedExpectClassToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromNestedExpectClassToActuals/");
    }

    @TestMetadata("fromTopLevelActualClassToExpect")
    public void testFromTopLevelActualClassToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelActualClassToExpect/");
    }

    @TestMetadata("fromTopLevelActualFunToExpect")
    public void testFromTopLevelActualFunToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelActualFunToExpect/");
    }

    @TestMetadata("fromTopLevelActualValToExpect")
    public void testFromTopLevelActualValToExpect() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelActualValToExpect/");
    }

    @TestMetadata("fromTopLevelExpectClassToActuals")
    public void testFromTopLevelExpectClassToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelExpectClassToActuals/");
    }

    @TestMetadata("fromTopLevelExpectFunToActuals")
    public void testFromTopLevelExpectFunToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelExpectFunToActuals/");
    }

    @TestMetadata("fromTopLevelExpectValToActuals")
    public void testFromTopLevelExpectValToActuals() throws Exception {
        runTest("../../idea/tests/testData/navigation/relatedSymbols/multiModule/fromTopLevelExpectValToActuals/");
    }
}
