package services;

import AlkeWalletM5.Repositories.UsuarioRepository;
import AlkeWalletM5.Services.UsuarioServiceImpl;
import AlkeWalletM5.models.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioServiceImpl usuarioService; // Usando la implementación concreta

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUsuarioById() {
        // Arrange
        String usuarioId = "1";
        Usuario mockUsuario = new Usuario();
        mockUsuario.setUsuarioId(usuarioId);
        mockUsuario.setNombre("Test User");

        // Configurar comportamiento del mock
        when(usuarioRepository.getUsuarioById(usuarioId)).thenReturn(Optional.of(mockUsuario));

        // Act
        Usuario resultUsuario = usuarioService.getUsuarioById(usuarioId);

        // Assert
        assertEquals(usuarioId, resultUsuario.getUsuarioId());
        assertEquals("Test User", resultUsuario.getNombre());

        // Verify
        verify(usuarioRepository, times(1)).getUsuarioById(usuarioId);
    }

    // Agregar más pruebas según las funcionalidades de UsuarioService
}
