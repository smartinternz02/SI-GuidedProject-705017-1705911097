<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Cura_TestSuite_MakeAppointmentvalidation_002</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient>smtpautomsg@gmail.com;prasamsaneerukonda@gmail.com;;</mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>1a39b2ce-ed0e-435e-9831-aaaa89dc30e5</testSuiteGuid>
   <testCaseLink>
      <guid>8aef95d1-d9d2-48d9-8581-3a9b50652a0b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_CURA_Login_001</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>31f45db9-4c84-4089-9cb3-cd3bd374846b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Test Data/Cura_Login_Test Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>31f45db9-4c84-4089-9cb3-cd3bd374846b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>input_password</value>
         <variableId>f239768e-4ac9-47e0-b0e7-07ddf6f239ff</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>31f45db9-4c84-4089-9cb3-cd3bd374846b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>input_username</value>
         <variableId>95930a5d-c5a3-4bae-bcd8-320e44148270</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6904ebc0-2b41-4efb-82d4-af57033668f2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_CURA_MakeAppointmentvalidation_002</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>a42c3d79-b249-4d4b-86ee-8225a4788497</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Test Data/Cura_Login_Test Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>676d6847-e625-4869-9f45-a436137ebbea</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_cura logout__003</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
