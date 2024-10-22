package br.com.develcode.whitelabel.model;

import br.com.develcode.whitelabel.model.enums.DeviceType;
import br.com.develcode.whitelabel.model.enums.MenuType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "menu", indexes = {
        @Index(name = "idx_menu_name", columnList = "name"),
        @Index(name = "idx_menu_parent_id", columnList = "parent_id")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String name;

    @Column(length = 255)
    private String description;

    @Column(nullable = false, length = 15)
    @Enumerated(EnumType.STRING)
    private MenuType type;

    @Column(nullable = false, length = 100)
    private String action;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private DeviceType deviceType;

    @Column(nullable = false)
    private Integer displayOrder;

    @Column(length = 50)
    private String icon;

    @Column(nullable = false)
    private Boolean isActive = true;

    @Column(nullable = false)
    private LocalDateTime createdIn;

    @Column
    private LocalDateTime updatedIn;

    @Column(length = 100)
    private String tooltip;

    @Column(length = 100)
    private String customCssClass;

    @Column(length = 100)
    private String redirectUrl;

    @Column(columnDefinition = "JSON")
    private String tags;

    @Column(nullable = false)
    private Boolean isSpecial = false;

    @Column(nullable = false)
    private Boolean isFavorite = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Menu parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Menu> children;
}
