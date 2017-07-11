import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;


public class InventoryWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public InventoryWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 781, 897);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 0, 0, 0);
		contentPane.add(panel_25);
		panel_25.setLayout(null);
		final int ycord = 0;
		final int xcord = 0;
		final JLabel Name = new JLabel("");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(10, 11, 234, 16);
		panel_25.add(Name);
		
		final JLabel Type = new JLabel("Type");
		Type.setBounds(10, 93, 107, 14);
		panel_25.add(Type);
		
		JLabel Level = new JLabel("Level:");
		Level.setBounds(10, 105, 39, 14);
		panel_25.add(Level);
		
		JLabel Value = new JLabel("Value:");
		Value.setBounds(10, 118, 39, 14);
		panel_25.add(Value);
		
		JLabel Armor = new JLabel("Armor:");
		Armor.setBounds(127, 93, 60, 14);
		panel_25.add(Armor);
		
		JLabel Strength = new JLabel("Strength:");
		Strength.setBounds(127, 105, 60, 14);
		panel_25.add(Strength);
		
		JLabel Intellect = new JLabel("Intellect:");
		Intellect.setBounds(127, 118, 60, 14);
		panel_25.add(Intellect);
		
		JLabel Stamina = new JLabel("Stamana:");
		Stamina.setBounds(127, 129, 60, 14);
		panel_25.add(Stamina);
		
		JLabel Dexterity = new JLabel("Dexterity:");
		Dexterity.setBounds(127, 141, 60, 14);
		panel_25.add(Dexterity);
		
		JLabel Ego = new JLabel("Ego:");
		Ego.setBounds(127, 154, 60, 14);
		panel_25.add(Ego);
		
		final JLabel DuelHanded = new JLabel("");
		DuelHanded.setBounds(10, 141, 107, 14);
		panel_25.add(DuelHanded);
		
		final JLabel ArmorValue = new JLabel("");
		ArmorValue.setBounds(183, 93, 46, 14);
		panel_25.add(ArmorValue);
		
		final JLabel StrengthValue = new JLabel("");
		StrengthValue.setBounds(183, 105, 46, 14);
		panel_25.add(StrengthValue);
		
		final JLabel IntellectValue = new JLabel("");
		IntellectValue.setBounds(183, 118, 46, 14);
		panel_25.add(IntellectValue);
		
		final JLabel StaminaValue = new JLabel("");
		StaminaValue.setBounds(183, 129, 46, 14);
		panel_25.add(StaminaValue);
		
		final JLabel DexterityValue = new JLabel("");
		DexterityValue.setBounds(183, 141, 46, 14);
		panel_25.add(DexterityValue);
		
		final JLabel EgoValue = new JLabel("");
		EgoValue.setBounds(183, 154, 46, 14);
		panel_25.add(EgoValue);
		
		final JLabel LevelValue = new JLabel("");
		LevelValue.setBounds(53, 105, 46, 14);
		panel_25.add(LevelValue);
		
		final JLabel ValueValue = new JLabel("");
		ValueValue.setBounds(53, 118, 46, 14);
		panel_25.add(ValueValue);
		
		final JTextPane Disc = new JTextPane();
		Disc.setEditable(false);
		Disc.setBackground(Color.WHITE);
		Disc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Disc.setSelectedTextColor(Color.BLACK);
		Disc.setBounds(10, 26, 234, 56);
		panel_25.add(Disc);
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				panel_25.setBounds(0,0,0,0);
			}
		});
		JPanel h1 = new JPanel();
		h1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Hats[0]!=null)
				{
					Name.setText(Player.Hats[0].getItemName());
					Disc.setText(Player.Hats[0].getItemDescription());
					Type.setText("Hat");
					//DuelHanded.setText(Player.Hats[0].itemName);
					//ArmorValue.setText(Player.Hats[0].itemName);
					StrengthValue.setText(String.valueOf(Player.Hats[0].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Hats[0].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Hats[0].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Hats[0].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Hats[0].getEgo()));
					LevelValue.setText(String.valueOf(Player.Hats[0].getLevel()));
					ValueValue.setText(String.valueOf(Player.Hats[0].getValue()));
				}
				if(Player.Hats[0]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+289, arg0.getY()+28, 254, 179);
			}
		});
		h1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		
		h1.setBackground(new Color(128, 128, 128));
		h1.setBounds(289, 28, 51, 44);
		contentPane.add(h1);
		
		JPanel h2 = new JPanel();
		h2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Hats[1]!=null)
				{
					Name.setText(Player.Hats[1].getItemName());
					Disc.setText(Player.Hats[1].getItemDescription());
					Type.setText("Hat");
					//DuelHanded.setText(Player.Hats[1].itemName);
					//ArmorValue.setText(Player.Hats[1].itemName);
					StrengthValue.setText(String.valueOf(Player.Hats[1].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Hats[1].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Hats[1].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Hats[1].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Hats[1].getEgo()));
					LevelValue.setText(String.valueOf(Player.Hats[1].getLevel()));
					ValueValue.setText(String.valueOf(Player.Hats[1].getValue()));
				}
				if(Player.Hats[1]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+350, arg0.getY()+28, 254, 179);
			}
		});
		h2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		h2.setBackground(Color.GRAY);
		h2.setBounds(350, 28, 51, 44);
		contentPane.add(h2);
		
		JPanel h3 = new JPanel();
		h3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Hats[2]!=null)
				{
					Name.setText(Player.Hats[2].getItemName());
					Disc.setText(Player.Hats[2].getItemDescription());
					Type.setText("Hat");
					//DuelHanded.setText(Player.Hats[2].itemName);
					//ArmorValue.setText(Player.Hats[2].itemName);
					StrengthValue.setText(String.valueOf(Player.Hats[2].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Hats[2].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Hats[2].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Hats[2].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Hats[2].getEgo()));
					LevelValue.setText(String.valueOf(Player.Hats[2].getLevel()));
					ValueValue.setText(String.valueOf(Player.Hats[2].getValue()));
				}
				if(Player.Hats[2]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+411, arg0.getY()+28, 254, 179);
			}
		});
		h3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		h3.setBackground(Color.GRAY);
		h3.setBounds(411, 28, 51, 44);
		contentPane.add(h3);
		
		JPanel helmet = new JPanel();
		helmet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[0]!=null)
				{
					Name.setText(Player.Armor[0].getItemName());
					Disc.setText(Player.Armor[0].getItemDescription());
					Type.setText("Helmet");
					//DuelHanded.setText(Player.Hats[0].itemName);
					//ArmorValue.setText(Player.Hats[0].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[0].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[0].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[0].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[0].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[0].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[0].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[0].getValue()));
				}
				if(Player.Armor[0]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+330, arg0.getY()+83, 254, 179);
			}
		});
		helmet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		helmet.setBackground(new Color(0, 0, 255));
		helmet.setBounds(330, 83, 93, 84);
		contentPane.add(helmet);
		
		JPanel neck = new JPanel();
		neck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[1]!=null)
				{
					Name.setText(Player.Armor[1].getItemName());
					Disc.setText(Player.Armor[1].getItemDescription());
					Type.setText("Necklace");
					//DuelHanded.setText(Player.Hats[1].itemName);
					//ArmorValue.setText(Player.Hats[1].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[1].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[1].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[1].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[1].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[1].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[1].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[1].getValue()));
				}
				if(Player.Armor[1]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+330, arg0.getY()+162, 254, 179);
			}
		});
		neck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		neck.setBackground(Color.BLUE);
		neck.setBounds(330, 169, 93, 17);
		contentPane.add(neck);
		
		JPanel chest = new JPanel();
		chest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[2]!=null)
				{
					Name.setText(Player.Armor[2].getItemName());
					Disc.setText(Player.Armor[2].getItemDescription());
					Type.setText("Body");
					//DuelHanded.setText(Player.Hats[2].itemName);
					//ArmorValue.setText(Player.Hats[2].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[2].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[2].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[2].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[2].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[2].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[2].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[2].getValue()));
				}
				if(Player.Armor[2]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+289, arg0.getY()+190, 254, 179);
			}
		});
		chest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		chest.setBackground(Color.BLUE);
		chest.setBounds(289, 190, 173, 149);
		contentPane.add(chest);
		
		JPanel main = new JPanel();
		main.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[6]!=null)
				{
					Name.setText(Player.Armor[6].getItemName());
					Disc.setText(Player.Armor[6].getItemDescription());
					Type.setText("Mainhand");
					//DuelHanded.setText(Player.Hats[6].itemName);
					//ArmorValue.setText(Player.Hats[6].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[6].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[6].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[6].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[6].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[6].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[6].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[6].getValue()));
				}
				if(Player.Armor[6]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+208, arg0.getY()+190, 254, 179);
			}
		});
		main.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		main.setBackground(Color.BLUE);
		main.setBounds(208, 190, 71, 176);
		contentPane.add(main);
		
		JPanel off = new JPanel();
		off.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[7]!=null)
				{
					Name.setText(Player.Armor[7].getItemName());
					Disc.setText(Player.Armor[7].getItemDescription());
					Type.setText("Offhand");
					//DuelHanded.setText(Player.Hats[7].itemName);
					//ArmorValue.setText(Player.Hats[7].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[7].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[7].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[7].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[7].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[7].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[7].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[7].getValue()));
				}
				if(Player.Armor[7]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+472, arg0.getY()+190, 254, 179);
			}
		});
		off.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		off.setBackground(Color.BLUE);
		off.setBounds(472, 190, 71, 176);
		contentPane.add(off);
		
		JPanel belt = new JPanel();
		belt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[3]!=null)
				{
					Name.setText(Player.Armor[3].getItemName());
					Disc.setText(Player.Armor[3].getItemDescription());
					Type.setText("Belt");
					//DuelHanded.setText(Player.Hats[3].itemName);
					//ArmorValue.setText(Player.Hats[3].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[3].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[3].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[3].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[3].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[3].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[3].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[3].getValue()));
				}
				if(Player.Armor[3]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+289, arg0.getY()+329, 254, 179);
			}
		});
		belt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		belt.setBackground(Color.BLUE);
		belt.setBounds(289, 342, 173, 38);
		contentPane.add(belt);
		
		JPanel pants = new JPanel();
		pants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[4]!=null)
				{
					Name.setText(Player.Armor[4].getItemName());
					Disc.setText(Player.Armor[4].getItemDescription());
					Type.setText("Pants");
					//DuelHanded.setText(Player.Hats[0].itemName);
					//ArmorValue.setText(Player.Hats[0].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[4].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[4].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[4].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[4].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[4].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[4].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[4].getValue()));
				}
				if(Player.Armor[4]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+299, arg0.getY()+383, 254, 179);
			}
		});
		pants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		pants.setBackground(Color.BLUE);
		pants.setBounds(299, 383, 156, 213);
		contentPane.add(pants);
		
		JPanel shoes = new JPanel();
		shoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Armor[5]!=null)
				{
					Name.setText(Player.Armor[5].getItemName());
					Disc.setText(Player.Armor[5].getItemDescription());
					Type.setText("Boots");
					//DuelHanded.setText(Player.Hats[5].itemName);
					//ArmorValue.setText(Player.Hats[5].itemName);
					StrengthValue.setText(String.valueOf(Player.Armor[5].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Armor[5].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Armor[5].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Armor[5].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Armor[5].getEgo()));
					LevelValue.setText(String.valueOf(Player.Armor[5].getLevel()));
					ValueValue.setText(String.valueOf(Player.Armor[5].getValue()));
				}
				if(Player.Armor[5]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+299, arg0.getY()+599, 254, 179);
			}
		});
		shoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		shoes.setBackground(Color.BLUE);
		shoes.setBounds(299, 599, 156, 57);
		contentPane.add(shoes);
		
		JPanel i1 = new JPanel();
		i1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+142, arg0.getY()+667-179, 254, 179);
		}});
		i1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i1.setBackground(new Color(255, 0, 0));
		i1.setBounds(142, 667, 51, 51);
		contentPane.add(i1);
		
		JPanel i2 = new JPanel();
		i2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+203, arg0.getY()+667-179, 254, 179);
			}
		});
		i2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i2.setBackground(Color.RED);
		i2.setBounds(203, 667, 51, 51);
		contentPane.add(i2);
		
		JPanel i3 = new JPanel();
		i3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+264, arg0.getY()+667-179, 254, 179);
			}
		});
		i3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i3.setBackground(Color.RED);
		i3.setBounds(264, 667, 51, 51);
		contentPane.add(i3);
		
		JPanel i4 = new JPanel();
		i4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+325, arg0.getY()+667-179, 254, 179);
			}
		});
		i4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i4.setBackground(Color.RED);
		i4.setBounds(325, 667, 51, 51);
		contentPane.add(i4);
		
		JPanel i5 = new JPanel();
		i5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+386, arg0.getY()+667-179, 254, 179);
			}
		});
		i5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i5.setBackground(Color.RED);
		i5.setBounds(386, 667, 51, 51);
		contentPane.add(i5);
		
		JPanel i6 = new JPanel();
		i6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+445, arg0.getY()+667-179, 254, 179);
			}
		});
		i6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i6.setBackground(Color.RED);
		i6.setBounds(445, 667, 51, 51);
		contentPane.add(i6);
		
		JPanel i7 = new JPanel();
		i7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+506-254, arg0.getY()+667-179, 254, 179);
			}
		});
		i7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i7.setBackground(Color.RED);
		i7.setBounds(506, 667, 51, 51);
		contentPane.add(i7);
		
		JPanel i8 = new JPanel();
		i8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+567-254, arg0.getY()+667-179, 254, 179);
			}
		});
		i8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i8.setBackground(Color.RED);
		i8.setBounds(567, 667, 51, 51);
		contentPane.add(i8);
		
		JPanel i9 = new JPanel();
		i9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+142, arg0.getY()+729-179, 254, 179);
			}
		});
		i9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i9.setBackground(Color.RED);
		i9.setBounds(142, 729, 51, 51);
		contentPane.add(i9);
		
		JPanel i10 = new JPanel();
		i10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+203, arg0.getY()+729-179, 254, 179);
			}
		});
		i10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i10.setBackground(Color.RED);
		i10.setBounds(203, 729, 51, 51);
		contentPane.add(i10);
		
		JPanel i11 = new JPanel();
		i11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+264, arg0.getY()+729-179, 254, 179);
			}
		});
		i11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i11.setBackground(Color.RED);
		i11.setBounds(264, 729, 51, 51);
		contentPane.add(i11);
		
		JPanel i12 = new JPanel();
		i12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+325, arg0.getY()+729-179, 254, 179);
			}
		});
		i12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i12.setBackground(Color.RED);
		i12.setBounds(325, 729, 51, 51);
		contentPane.add(i12);
		
		JPanel i13 = new JPanel();
		i13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+386, arg0.getY()+729-179, 254, 179);
			}
		});
		i13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i13.setBackground(Color.RED);
		i13.setBounds(386, 729, 51, 51);
		contentPane.add(i13);
		
		JPanel i14 = new JPanel();
		i14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+445, arg0.getY()+729-179, 254, 179);
			}
		});
		i14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i14.setBackground(Color.RED);
		i14.setBounds(445, 729, 51, 51);
		contentPane.add(i14);
		
		JPanel i15 = new JPanel();
		i15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+506-254, arg0.getY()+729-179, 254, 179);
			}
		});
		i15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i15.setBackground(Color.RED);
		i15.setBounds(506, 729, 51, 51);
		contentPane.add(i15);
		
		JPanel i16 = new JPanel();
		i16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+567-254, arg0.getY()+729-179, 254, 179);
			}
		});
		i16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i16.setBackground(Color.RED);
		i16.setBounds(567, 729, 51, 51);
		contentPane.add(i16);
		
		JPanel i17 = new JPanel();
		i17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+142, arg0.getY()+791-179, 254, 179);
			}
		});
		i17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i17.setBackground(Color.RED);
		i17.setBounds(142, 791, 51, 51);
		contentPane.add(i17);
		
		JPanel i18 = new JPanel();
		i18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+203, arg0.getY()+791-179, 254, 179);
			}
		});
		i18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i18.setBackground(Color.RED);
		i18.setBounds(203, 791, 51, 51);
		contentPane.add(i18);
		
		JPanel i19 = new JPanel();
		i19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+264, arg0.getY()+791-179, 254, 179);
			}
		});
		i19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i19.setBackground(Color.RED);
		i19.setBounds(264, 791, 51, 51);
		contentPane.add(i19);
		
		JPanel i20 = new JPanel();
		i20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+325, arg0.getY()+791-179, 254, 179);
			}
		});
		i20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i20.setBackground(Color.RED);
		i20.setBounds(325, 791, 51, 51);
		contentPane.add(i20);
		
		JPanel i21 = new JPanel();
		i21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+386, arg0.getY()+791-179, 254, 179);
			}
		});
		i21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i21.setBackground(Color.RED);
		i21.setBounds(386, 791, 51, 51);
		contentPane.add(i21);
		
		JPanel i22 = new JPanel();
		i22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+445, arg0.getY()+791-179, 254, 179);
			}
		});
		i22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i22.setBackground(Color.RED);
		i22.setBounds(445, 791, 51, 51);
		contentPane.add(i22);
		
		JPanel i23 = new JPanel();
		i23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+506-254, arg0.getY()+791-179, 254, 179);
			}
		});
		i23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i23.setBackground(Color.RED);
		i23.setBounds(506, 791, 51, 51);
		contentPane.add(i23);
		
		JPanel i24 = new JPanel();
		i24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_25.setBackground(Color.WHITE);
				if(Player.Inventory[ycord][xcord]!=null)
				{
					Name.setText(Player.Inventory[ycord][xcord].getItemName());
					Disc.setText(Player.Inventory[ycord][xcord].getItemDescription());
					if(Player.Inventory[ycord][xcord].getType() == 1)
					Type.setText("Hat");
					if(Player.Inventory[ycord][xcord].getType() == 2)
					Type.setText("Head");
					if(Player.Inventory[ycord][xcord].getType() == 3)
						Type.setText("Necklace");
					if(Player.Inventory[ycord][xcord].getType() == 4)
						Type.setText("Body");
					if(Player.Inventory[ycord][xcord].getType() == 5)
						Type.setText("Belt");
					if(Player.Inventory[ycord][xcord].getType() == 6)
						Type.setText("Pants");
					if(Player.Inventory[ycord][xcord].getType() == 7)
						Type.setText("Boots");
					if(Player.Inventory[ycord][xcord].getType() == 8)
						Type.setText("MainHand");
					if(Player.Inventory[ycord][xcord].getType() == 9)
						Type.setText("OffHand");
					//DuelHanded.setText(Player.Inventory[ycord][xcord].itemName);
					//ArmorValue.setText(Player.Inventory[ycord][xcord].itemName);
					StrengthValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStrength()));
					IntellectValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getIntellect()));
					StaminaValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getStamana()));
					DexterityValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getDexterity()));
					EgoValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getEgo()));
					LevelValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getLevel()));
					ValueValue.setText(String.valueOf(Player.Inventory[ycord][xcord].getValue()));
				}
				if(Player.Inventory[ycord][xcord]==null)
				{
					Name.setText("Empty");
					Disc.setText("");
					Type.setText("");
					DuelHanded.setText("");
					//ArmorValue.setText("");
					StrengthValue.setText("");
					IntellectValue.setText("");
					StaminaValue.setText("");
					DexterityValue.setText("");
					EgoValue.setText("");
					LevelValue.setText("");
					ValueValue.setText("");
				}
				panel_25.setBounds(arg0.getX()+567-254, arg0.getY()+791-179, 254, 179);
			}
		});
		i24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_25.setBounds(0,0,0,0);
			}
		});
		i24.setBackground(Color.RED);
		i24.setBounds(567, 791, 51, 51);
		contentPane.add(i24);
		this.setVisible(true);
		
	}
	
}
