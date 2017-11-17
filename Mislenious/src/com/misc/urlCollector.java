package com.misc;
import java.net.*;
import java.io.*;
public class urlCollector {
	

	public static void main(String[] args) throws Exception {
	        URL oracle = new URL("https://ark.intel.com/products/126686/Intel-Core-i7-8700-Processor-12M-Cache-up-to-4_60-GHz");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                yc.getInputStream()));
	        String inputLine;
	        //Essentials
	        String ParentGroup;
	        String CodeNameText;
	        String MarketSegment;
	        String ProcessorNumber;
	        String StatusCodeText;
	        String BornOnDate;
	        String Lithography;
	        String Price1KUnits;
	        //Performance;
	        String CoreCount;
	        String ThreadCount;
	        String ClockSpeed;
	        String ClockSpeedMax;
	        String Cache;
	        String Bus;
	        String MaxTDP;
	        //Supplemental Information;
	        String Embedded;
	        String DrcConflictFree;
	        String DatasheetUrl;
	        //Memory Specifications;
	        String MaxMem;
	        String MemoryTypes;
	        String NumMemoryChannels;
	        String ECCMemory;
	        //Graphics Specifications;
	        String ProcessorGraphicsModelId;
	        String GraphicsFreq;
	        String GraphicsMaxFreq;
	        String GraphicsMaxMem;
	        String GraphicsExecutionUnits;
	        String Graphics4KSupportLevel;
	        String GraphicsMaxResolutionHDMI;
	        String GraphicsMaxResolutionDP;
	        String GraphicsMaxResolutionIFP;
	        String GraphicsDirectXSupport;
	        String GraphicsOpenGLSupport;
	        String QuickSyncVideo;
	        String InTru3D;
	        String CVTHD;
	        String ClearVideoTechnology;
	        String NumDisplaysSupported;
	        String GraphicsDeviceId;
	        //Expansion Options;
	        String ScalableSockets;
	        String PCIExpressRevision;
	        String PCIExpressConfigs;
	        String NumPCIExpressPorts;
	        //Package Specifications
	        String SocketsSupported;
	        String MaxCPUs;
	        String ThermalSolutionSpecification;
	        String ThermalJunctionRateCode;
	        String PackageSize;
	        String IsHalogenFree;
	        //Advanced Technologies
	        String OptaneMemorySupport;
	        String TBTVersion;
	        String VProTechnology;
	        String HyperThreading;
	        String VTX;
	        String VTD;
	        String ExtendedPageTables;
	        String TransactionalSynchronizationExtensionVersion;
	        String EM64;
	        String InstructionSet;
	        String InstructionSetExtensions;
	        String HaltState;
	        String SpeedstepTechnology;
	        String ThermalMonitoring2Indicator;
	        String IdentityProtectionTechVersion;
	        String StableImagePlatformProgramVersion;
	        //Security & Reliability
	        String AESTech;
	        String SecureKeyTechVersion;
	        String SoftwareGuardExtensions;
	        String MemoryProtectionExtensionsVersion;
	        String OSGuardTechVersion;
	        String TXT;
	        String ExecuteDisable;
	        String DeviceProtectionTechBootGuardVersion;
	        
	        
	        
	        
			while ((inputLine = in.readLine()) != null) {
	            /*System.out.println(inputLine);
				CoreCount
				ThreadCount;
		        ClockSpeed;
		        ClockSpeedMax;
		        Cache;
		        Bus;
		        MaxTDP
	        in.close();*/
	    }
}}
