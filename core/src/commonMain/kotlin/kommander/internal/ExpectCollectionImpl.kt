package kommander.internal

import kommander.Expect
import kommander.ExpectCollection
import kotlin.test.assertTrue

/**
 * @param E Expected Type
 *
 * Samples
 *
 */
@PublishedApi
internal class ExpectCollectionImpl<E>(
    override val value: Collection<E>?
) : ExpectCollection<E>, Expect<Collection<E>?> by ExpectImpl(value) {
    override fun toContain(vararg elements: E?) = assertTrue(
        """
            
            Expected   : ${
            elements.joinToString(
                ",",
                prefix = "[",
                postfix = "]"
            ) { it.toString() }
        } to be inside the collection
            Collection : [
                ${value?.joinToString(separator = "\n        ") { it.toString() }}
            ]
            ===============================================
    """.trimIndent()
    ) { value?.containsAll(elements.toList()) == true }

    override fun toNotContain(vararg elements: E?) = assertTrue(
        """
    
        Expected   : ${
            elements.joinToString(
                ",",
                prefix = "[",
                postfix = "]"
            ) { it.toString() }
        } to not be inside the collection
        Collection : [
            ${value?.joinToString(separator = "\n        ") { it.toString() }}
        ]
        ===============================================
        """.trimIndent()
    ) { value?.containsAll(elements.toList()) != true }

    override fun toBeEmpty() = assertTrue(
        """
    
    Expected   : Collection to be empty
    Collection : [
        ${value?.joinToString(separator = "\n        ") { it.toString() }}
    ]
    ===============================================
    """.trimIndent()
    ) { value?.isEmpty() == true }

    override fun toContainElements() = assertTrue(
        """
    
    Expected   : Collection to contain elements
    Collection : Collection was empty
    ===============================================
    """.trimIndent()
    ) { value?.isNotEmpty() == true }

    override fun toHave(length: Int) = assertTrue(
        """
    
    Expected : $length to be length of the collection
    Actual   : ${value?.size} is the length of the collection
    ===============================================
    """.trimIndent()
    ) { value?.size == length }

    override fun toBeOfSize(size: Int) = assertTrue(
        """
    
    Expected : $size to be size of the collection
    Actual   : ${value?.size} is the size of the collection
    ===============================================
    """.trimIndent()
    ) { value?.size == size }
}