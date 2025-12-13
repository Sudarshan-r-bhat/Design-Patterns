package com.project.designpatterns.statePattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class StatePatternTest {

	private Document doc;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	void setUp() {
		doc = new Document();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	void testInitialStateIsNull() {
		assertNull(doc.getState());
	}

	@Test
	void testDraftTransition() {
		doc.draft();
		assertNotNull(doc.getState());
		assertTrue(doc.getState() instanceof DraftState);
		assertEquals("document is under continuous development now.", doc.getText());
		assertTrue(outContent.toString().contains("Drafting the document..."));
	}

	@Test
	void testDraftToModerateTransition() {
		doc.draft();
		outContent.reset();
		doc.moderate();
		assertTrue(doc.getState() instanceof ModerateState);
		assertEquals("document is under levels of moderation.", doc.getText());
		assertTrue(outContent.toString().contains("Moderating the document..."));
	}

	@Test
	void testModerateToPublishTransition() {
		doc.draft();
		doc.moderate();
		outContent.reset();
		doc.publish();
		assertTrue(doc.getState() instanceof PublishState);
		assertEquals("document is published", doc.getText());
		assertTrue(outContent.toString().contains("Publishing the document..."));
	}

	@Test
	void testInvalidDraftToPublishTransition() {
		doc.draft();
		outContent.reset();
		doc.publish();
		// Should still be in DraftState
		assertTrue(doc.getState() instanceof DraftState);
		assertTrue(outContent.toString().contains("Cannot publish directly from draft state"));
	}

	@Test
	void testInvalidPublishToDraftTransition() {
		doc.draft();
		doc.moderate();
		doc.publish();
		outContent.reset();
		doc.draft();
		// Should still be in PublishState
		assertTrue(doc.getState() instanceof PublishState);
		assertTrue(outContent.toString().contains("Cannot go back to draft from published state"));
	}

	@Test
	void testInvalidPublishToModerateTransition() {
		doc.draft();
		doc.moderate();
		doc.publish();
		outContent.reset();
		doc.moderate();
		// Should still be in PublishState
		assertTrue(doc.getState() instanceof PublishState);
		assertTrue(outContent.toString().contains("Cannot go back to moderate from published state"));
	}

	@Test
	void testInvalidModerateToDraftTransition() {
		doc.draft();
		doc.moderate();
		outContent.reset();
		doc.draft();
		// Should still be in ModerateState
		assertTrue(doc.getState() instanceof ModerateState);
		assertTrue(outContent.toString().contains("Cannot go back to draft from moderate state"));
	}

	@Test
	void testModerateWithoutDraft() {
		outContent.reset();
		doc.moderate();
		assertNull(doc.getState());
		assertTrue(outContent.toString().contains("Document has no state. Please draft it first."));
	}

	@Test
	void testPublishWithoutDraft() {
		outContent.reset();
		doc.publish();
		assertNull(doc.getState());
		assertTrue(outContent.toString().contains("Document has no state. Please draft it first."));
	}

	@Test
	void testCompleteWorkflow() {
		// Initial state
		doc.setText("raw data");
		assertEquals("raw data", doc.getText());
		
		// Draft
		doc.draft();
		assertTrue(doc.getState() instanceof DraftState);
		assertEquals("document is under continuous development now.", doc.getText());
		
		// Moderate
		doc.moderate();
		assertTrue(doc.getState() instanceof ModerateState);
		assertEquals("document is under levels of moderation.", doc.getText());
		
		// Publish
		doc.publish();
		assertTrue(doc.getState() instanceof PublishState);
		assertEquals("document is published", doc.getText());
	}

	@org.junit.jupiter.api.AfterEach
	void restoreStreams() {
		System.setOut(originalOut);
	}
}
