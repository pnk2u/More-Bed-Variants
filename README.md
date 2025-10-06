# <img width='24' src="./src/main/resources/icon.png"> More Bed Variants
> ![Mod Icon](https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/More-Bed-Variants/pres/logo/logo_c.png)
>
> A mod adding wood variants for Minecraft's Beds and enhancing their way of being rendered allowing for additional resourcepack capabilities and improved performance.

### Compatibility

- Minecraft: `1.20.1`, `1.21(.1)`, `1.21.4`~`1.21.10`
- Mod Loader: _Fabric_
- Requires: [`Fabric API`](https://modrinth.com/mod/fabric-api)
- Added support for:
    - [<img width='16' src="https://raw.githubusercontent.com/TeamMidnightDust/BetterBeds/main/common/src/main/resources/assets/betterbeds/icon.png"> `Better Beds`](https://modrinth.com/mod/better-beds)
    - [<img width='16' src="https://raw.githubusercontent.com/FoundationGames/EnhancedBlockEntities/1.21.4/src/main/resources/assets/enhancedblockentities/icon.png"> `Enhanced Block Entities`](https://modrinth.com/mod/enhanced-block-entities)

### ᴬ⃯ ᵦ⃔ Translations

Currently available in:
- English
- German
- Chinese, Simplified (@[qiuqimc](/../../../../qiuqimc) with [PR #4](../../pull/4), added in [`1.5.1`](/../../#151))
- Ukrainian (@[StarmanMine142](/../../../../StarmanMine142) with [PR #6](../../pull/6)/[7](../../pull/7), added in [`1.5.2`](/../../#152) and updated with [PR #8](../../pull/8), added in [`1.6.1`](/../../#161))

Want to help translate? Feel free to open a PR to the **default branch (`1.21(.1)`)**.

### Changelog History

<!--CHANGELOG:START-->
### 2.0.3:
- `1.21.9(10)`: Update to 1.21.9(10)
- `1.21.5(-8)`: Update built-in resource packs' format up to 1.21.8
### 2.0.2:
- Fix crash introduced by `2.0.1` (for example when using [The Aether](https://modrinth.com/mod/aether) mod)
### 2.0.1:
- Fix crash when using [Traveler's Backpack](https://modrinth.com/mod/travelersbackpack) or any other mod that adds new Blocks based on Beds (in this case the Sleeping Bag Blocks)
# 2.0.0:
- **'More Bed Variants' uses block rendering now**:
    - This also applies to vanilla beds
    - Decreases performance impact of all beds (Block Entity rendering is no longer used)
    - Allows for resource packs to add custom bed models:
        - There's now two new included resource packs:
            - **More '_Pillowed_ ' Bed Variants**:   
              ➜ Adds a raised pillow to all beds
            - **More '_Pillowed_ ' (_Connected_ ) Bed Variants**:   
              ➜ Adds pillows and also allows beds of the same wood type to connect seamlessly

          ![side-by-side comparison](https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/More-Bed-Variants/pres/mr_desc_banner.png)
        - Both included resource packs' models are used for the block's outline and collision shape
          ![block outline](https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/More-Bed-Variants/pres/block_outline.png)
            - If you would like to use this feature on a dedicated server, you can use the command ``/setbedshape`` to make the shape fit the resource pack the players are using:
                - ``/setbedshape vanilla``: Vanilla flat beds
                - ``/setbedshape pillowed unconnected``: Beds with pillow shape
                - ``/setbedshape pillowed connected``: Connected beds with pillows
            - > In singleplayer, this happens automatically at start-up and when a resource pack reloads!
        - Full feature parity with mods like _Better Beds_ and _Enhanced Block Entities (EBE)_.
            - Fixes rendering bugs found in 1.21 versions of those mods.
            - Nevertheless aims to be compatible with either but neither are necessary, please report any issues via [GitHub](https://github.com/pnk2u/More-Bed-Variants/issues) or [Discord](https://dsc.lieonlion.dev)!
- Fixes:
    - Add Oak beds to custom Creative Mode tab
    - Fix beds appearing on maps as the wood's color instead of the bed/wool's color (Bed heads appear as _White Wool_ like vanilla beds)

### 1.6.2:
- `1.21.5`: Update to 1.21.5
### 1.6.1:
- Update Ukrainian Translation for new _**Bound Bamboo** Beds_ (Thanks to [Starman](https://modrinth.com/user/StarmanMine142))
## 1.6.0:
- Add two new Bamboo Bed Types inspired by the _Bamboo Raft_ and the _Bamboo Block_ and its _Stripped variant_ respectively. (Thanks to [Redupro](https://modrinth.com/user/Redupro) for the idea and initial design.)

![](https://uwu.catgirl.host/i/twtib.png)  
![](https://uwu.catgirl.host/i/z2po9.png)![](https://uwu.catgirl.host/i/vz6zp.png)
### 1.5.2:
- Add Ukrainian Translation (by [Starman](https://modrinth.com/user/StarmanMine142))
### 1.5.1:
- Fix Bed variant items stacking to 64 (shouldn't stack at all)
- Add Simplified Chinese Translation (by @[qiuqimc](https://github.com/qiuqimc))
- `1.21.4`: Update to 1.21.4
## 1.5.0:
- `1.21.3⁺`: Add _**Pale Oak** Beds_
## 1.4.0:
- Add integration with [Quad](https://modrinth.com/mod/quad) `1.3.0⁺`'s block replacement allowing new villages to generate biome-appropriate bed variants (e.g., Savanna villages use _**Acacia** Red/Yellow/Orange Beds_).
- `1.21.2`, `1.21.3`: Update to 1.21.2, 1.21.3
## 1.3.0:
- Villagers can now properly use the _Bed_ variants to sleep in at night
### 1.2.1:
- Add missing _Gray Bed_ Variants to bed tags
## 1.2.0:
- Add dyeing recipes for all the bed variants and their colors
- Group both the regular and the dyeing recipes respectively in the recipebook
## 1.1.0:
- Re-add creative mode tab
#### 1.0.2-h:
- Fix game crash on startup
> _`The section above is automatically updated with each new release and only includes already published releases.`_
---
#### Support/Contact
- Suggestions? Questions? Bug reports?  
  Feel free to [open an issue](/../../issues)!  
  &nbsp;  
  You can also contact me via email at [contact@pnku.de](mailto:contact@pnku.de) or join the [Discord](https://dsc.lieonlion.dev) and contact me there.
