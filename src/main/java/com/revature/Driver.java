package com.revature;

import org.apache.log4j.Logger;

import com.revature.services.UserInterface;

public class Driver {
	private static Logger logger = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) {
		System.out.println("\r\n" + 
				"               .                .                                                        .          \r\n" + 
				"     7MMMMMMMO:           .       .        .+MMI       DMMD8MMM8.                  .  MMM8          \r\n" + 
				"     7MM8  7MMM          .                . +MMI       DMMI  NMMM             .       MMMD          \r\n" + 
				"     7MM8  $MMM  NMM:MMM: MMMN  DM N= .MMMZ +MMI       DMMI :MMMO  M? ~MM8  MMMNMMMM: MMMN  $I      \r\n" + 
				"     7MMMMMMM?  .MMZ 7MMM~8MMM  M::M,  MMMN +MMI       DMMMMMMM    M+ ,MMM. MMMM ?MM= MMMN MM       \r\n" + 
				"     7MM8 IMMM+ +MM7.?MMMI MMM~I+   ZMMMMMN +MMI       DMMI .DMMM  :7M8MMM. MMMZ ?MM+ MMMMMMM       \r\n" + 
				"     7MM8  NMMM =MM$ ?MMMI :MMMM  7MMN NMMN +MMI       DMMI  =MMM +MM: MMM. MMMZ ?MM+ MMMMZMMO      \r\n" + 
				"     7MM8  DMMM  MMD ZMM7.  MMM=  MMM8 MMMN +MMI       DMMI .DMMM 8MM..MMM,.MMMO IMM+ MMMO MMMM     \r\n" + 
				"     7MM8  7MMM.  ?MMMN ..  ~MI   .$MMM OMM8+MMI       DMMMMMMD+   MMM$ZMMM8MMM8 IMM+ MMM8 ?MMM     \r\n" + 
				"        .      ..           .M          .                   .                         .             \r\n" + 
				"                          MMM7                                                                      \r\n" + 
				"                                                                                                    \r\n" + 
				"                               .                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"               ~MMIM~     OMMMMMMMZ.          .          .        =M:          .                .   \r\n" + 
				"               MM8 7.     OMMM  ZMMM        .      .       .     MMM:     .                         \r\n" + 
				"      7MMDMO: 8MMMMZ      OMMM  7MMM   IMMMO.,MMMM   8 .MMMMMN==MMMMM==MM7 .MMM~,MMMIMMI. +MMMD     \r\n" + 
				"     ?MM  MMM  MMMD       OMMM.:MMM$  ?MM .MM IMMM  IM O+ .7MMM  MMM: =MM7  MMM~,MMM=OMO MMD 8MZ    \r\n" + 
				"   .:MMM  MMMZ MMMD       OMMM  MMN~ ?MMMOOMM~ MMM8 M,  ?DNZMMM  MMM: =MMI .MMM~,MMM    :MMNONMM7   \r\n" + 
				"    :MMM  MMM$ MMMD       OMMM  MMMD IMMM      8MMM+I :MMM 7MMM  MMM: =MMI  MMM~,MMM    ~MM8        \r\n" + 
				"     8MM  MMM= MMMD       OMMM  MMMM :MMM   $:  MMMM  ZMMM 7MMM  MMM: ~MMI  MMM~,MMM .   MMN   M?   \r\n" + 
				"      MM?.MMD  MMMD       OMMM  NMMM  :MMZ:7M   +MMM  ~MMMONMMMI MMMZ~.MMMMDMMM~,MMM     8MMD.+7.   \r\n" + 
				"                                  . .                                   .                   .       \r\n" + 
				"                       .                                   .                .               .       \r\n" + 
				"                                                        MM                                          \r\n" + 
				"                                                      MMMM    =                                     \r\n" + 
				"                                                   MMMMM$ MMM               .     O  .              \r\n" + 
				"                                           ZMMMMM.MMMMMMMMMM                 NMM                    \r\n" + 
				"                                        IMMMMMMMMMMMMMMMMMMM  .         MMMMM                       \r\n" + 
				"                                    NMMMMMMMMMMMMMMMMMMMMMMMM?   MMMMMMMM       .                   \r\n" + 
				"                                   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                              \r\n" + 
				"                                 .MMMM+:MMMMMMMMMMMMMMMMMMMMMMM8MMM  .                              \r\n" + 
				"                                MM   MMMMMMMMMMMMMMMMMMMMMMMMMMMN                                   \r\n" + 
				"                                  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                   \r\n" + 
				"                                MMMMMMMMMMMMMMMMMMMMMMMMMMMMM.MMM                                   \r\n" + 
				"                              .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.MM                                   \r\n" + 
				"                           .  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                   \r\n" + 
				"                             MMMMMMMMMMMMMMMMMMMM+MMMMMMMMMMMMMMM                                   \r\n" + 
				"                            DMMMMMMMMMMMMMMMMMMMM  MMMMMMMMMMMMMMM                                  \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMM  MMMMMMMMMMMMMM                                  \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMM      MMMMMMMMMMM                                 \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMMMM      ZMMMMMMMM                                 \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMMMMMM     OMMMMMMM                                 \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMMMMMMM     MMMMMMM                                 \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMMMMMMMMM   MMMMMMM.                                \r\n" + 
				"                             MMMMMMMMMMMMMMMMMMMMMMMMMMMMM   M  MMO.                                \r\n" + 
				"                             MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          .                               \r\n" + 
				"                              MMMMMMMMMMMMMMMMMMMMMMMMMMMMD   .                                     \r\n" + 
				"                               ZMMMMMMMMMMMMMMMMMMMMMMMMMMM   .                                     \r\n" + 
				"                                NMMMMMMMMMMMMMMMMMMMMMMMMMM~                                        \r\n" + 
				"                                  MMMMMMMMMMMM.MMMMMMMMMMMM?                                        \r\n" + 
				"                                    MMMMMMMMMMM  MMMMMMMMMM                                         \r\n" + 
				"                                        $MMMMMMMMMZMMMMMMMM                                         \r\n" + 
				"                                           $MMMMMMMMMMMMMMM                                         \r\n" + 
				"                                ..       $MMMMMMMMMMMMMMMM                                          \r\n" + 
				"                                     MMMMMMMMMMMMMMMM8MMMMMMMMM                                     \r\n" + 
				"                              .   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+                                  \r\n" + 
				"                       .       DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN                               \r\n" + 
				"                            MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                             \r\n" + 
				"                       IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                        \r\n" + 
				"                     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                     \r\n" + 
				"                  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                  \r\n" + 
				"                 MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.                \r\n" + 
				"                     DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                      \r\n" + 
				"                      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM       .              \r\n" + 
				"                  ..                           MMMMM                                                \r\n" + 
				"                                                 .                                 .                \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM    .MMMMMMMM                           \r\n" + 
				"                           MMMMMMM   .  MMMMMMM   . MMMMMMMM  .  MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM   . MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM .   MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM .   MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM   . MMMMMMMM                           \r\n" + 
				"                           MMMMMMM      MMMMMMM     MMMMMMMM     MMMMMMMM                           \r\n" + 
				"                      . +?+MMMMMMM+?++?IMMMMMMM+??++MMMMMMMM++?++MMMMMMMM++?                        \r\n" + 
				"                      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                      \r\n" + 
				"                     NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                      \r\n" + 
				"                     NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                      \r\n" + 
				"                       .                                                                            \r\n" + 
				"                                                                                                    \r\n" + 
				"                 MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ                 \r\n" + 
				"                 MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM   .             \r\n" + 
				"                 MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM ");
		System.out.println("Welcome to Her Majesty's Royal Bank of Revature. What would you like to do?");
		logger.info("Application Started");
		UserInterface.entrySwitch(UserInterface.entryScreen());
	}
	
}
