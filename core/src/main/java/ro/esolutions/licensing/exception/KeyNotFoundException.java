/*
 * KeyNotFoundException.java from LicenseManager modified Friday, September 21, 2012 07:46:54 CDT (-0500).
 *
 * Copyright 2010-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ro.esolutions.licensing.exception;

/**
 * This is thrown when the key (file) could not be found.
 *
 * @author Nick Williams
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class KeyNotFoundException extends RuntimeException {

    private static final String MESSAGE = "The key file could not be found.";

    public KeyNotFoundException() {
        super(MESSAGE);
    }

    public KeyNotFoundException(final String message) {
        super(message);
    }

    public KeyNotFoundException(final Throwable cause) {
        super(MESSAGE, cause);
    }

    public KeyNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
